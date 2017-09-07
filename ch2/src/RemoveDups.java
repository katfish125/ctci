import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedList test = new LinkedList(0);
        test.append(0);
        test.append(1);
        test.append(2);
        test.append(2);
        test.append(3);
        test.append(3);
        test.append(3);
        test.append(4);

        removeDups(test);
        // removeDupsNoBuffer(test);
        test.printAll();
    }

    // before learning how to implement hash
    private static void removeDupsNoBuffer(LinkedList test) {
        Node currOne = test.head;
        while (currOne != null) {
            Node find = currOne.next;
            while (find != null) {
                if (currOne.data == find.data) {
                    test.remove(currOne.data);
                    break;
                }
                find = find.next;
            }
            currOne = currOne.next;
        }
    }

    // with hash set
    private static void removeDups(LinkedList test) {
        HashSet seen = new HashSet();
        Node currOne = test.head;
        while (currOne != null) {
            if (seen.contains(currOne.data)) {
                test.remove(currOne.data);
            }
            else {
                seen.add(currOne.data);
            }
            currOne = currOne.next;
        }
    }
}
