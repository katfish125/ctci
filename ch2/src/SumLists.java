public class SumLists {
    public static void main(String[] atgs) {
        LinkedList firstNum = new LinkedList(7);
        firstNum.append(1);
        firstNum.append(6);
        LinkedList secNum = new LinkedList(5);
        secNum.append(9);
        secNum.append(2);

        LinkedList firstFol = new LinkedList(6);
        firstFol.append(1);
        firstFol.append(7);
        LinkedList secFol = new LinkedList(2);
        secFol.append(9);
        secFol.append(5);

        LinkedList res = sumLists(firstNum, secNum, true);
        res.printAll();
        LinkedList resFol = sumLists(firstFol, secFol, false);
        resFol.printAll();
    }

    // mode: reverse mode on (true) / off (false)
    private static LinkedList sumLists(LinkedList first, LinkedList second, boolean mode) {
        LinkedList res = new LinkedList();
        if (mode) {
            Node f = first.head;
            Node s = second.head;
            int carry = 0;
            int val = 0;
            while (f != null || s != null) {
                if (f == null) {
                    res.append(s.data);
                    s = s.next;
                }
                else if (s == null) {
                    res.append(f.data);
                    f = f.next;
                }
                else {
                    val = f.data + s.data;
                    res.append(val%10 + carry);
                    carry = val / 10;
                    f = f.next;
                    s = s.next;
                }
            }
            return res;
        }
        else {
            int f = listToInt(first);
            int s = listToInt(second);
            int ret = f + s;
            int tens = 1;
            while (ret / tens > 10) {
                tens *= 10;
            }
            int dig;
            while (tens > 0.1) {
                dig = ret / tens;
                res.append(dig);
                ret = ret - dig*tens;
                tens /= 10;
            }
            return res;
        }
    }

    private static int listToInt(LinkedList list) {
        Node currOne = list.head;
        int ret = 0;
        while (currOne != null) {
            ret *= 10;
            ret += currOne.data;
            currOne = currOne.next;
        }
        return ret;
    }
}
