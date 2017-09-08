public class LoopDetection {
    public static void main(String[] args) {
        // setting up the corrupted linked list
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;
        LinkedList l = new LinkedList();
        l.head = n0;

        Node startLoop = loopDetection(l);
        System.out.println("The start of the loop is at "+startLoop.data);
    }

    // solution from book. since we are given a circular linked list according to the question,
    // I will not assume otherwise, unlike the solutions.
    private static Node loopDetection(LinkedList l) {
        Node slow = l.head;
        Node fast = l.head;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (fast != slow);

        fast = l.head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
