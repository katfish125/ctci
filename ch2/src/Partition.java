public class Partition {
    public static void main(String[] args) {
        LinkedList test = new LinkedList(3);
        test.append(5);
        test.append(8);
        test.append(5);
        test.append(10);
        test.append(2);
        test.append(1);

        partition(test, 5);
        test.printAll();
    }

    private static void partition(LinkedList test, int lim) {
        Node currOne = test.head;
        Node limPtr = test.head;
        while (currOne != null) {
            if (currOne.data < lim) {
                if (limPtr.data >= lim) {
                    int temp = limPtr.data;
                    limPtr.data = currOne.data;
                    currOne.data = temp;
                }
                limPtr = limPtr.next;
            }
            currOne = currOne.next;
        }
    }
}
