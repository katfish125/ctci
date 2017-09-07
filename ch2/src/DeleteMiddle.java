public class DeleteMiddle {
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


        // let's say we want to remove the third node, "1"
        Node currOne = test.head;
        for (int i = 0; i < 2; i++) {
            currOne = currOne.next;
        }

        deleteMiddle(currOne);
        test.printAll();
    }

    private static void deleteMiddle(Node currOne) {
        currOne.data = currOne.next.data;
        currOne.next = currOne.next.next;
    }
}
