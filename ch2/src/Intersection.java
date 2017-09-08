public class Intersection {
    public static void main(String[] args) {
        // setting up the linked lists
        Node n0 = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(7);
        Node n3 = new Node(6);
        Node n4 = new Node(4);
        Node n5 = new Node(6);
        n1.next = n0;
        n2.next = n1;
        n3.next = n2;
        n4.next = n3;
        n5.next = n2;
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.head = n4;
        l2.head = n5;

        Node res = checkIntersection(l1,l2);
        if (res != null) {
            System.out.println("The linked lists intersect at "+res.toString()+" with value "+res.data);
        }
        else {
            System.out.println("The linked lists do not intersect.");
        }
    }

    private static Node checkIntersection(LinkedList l1, LinkedList l2) {
        Node n1 = l1.head;
        Node n2 = l2.head;
        int count1 = 0, count2 = 0;
        while (n1.next != null) {
            n1 = n1.next;
            count1++;
        }
        while (n2.next != null) {
            n2 = n2.next;
            count2++;
        }
        if (n1 != n2) {
            return null;
        }
        else {
            n1 = l1.head;
            n2 = l2.head;
            while (count1 < count2) {
                n2 = n2.next;
                count2--;
            }
            while (count1 > count2) {
                n1 = n1.next;
                count1--;
            }
            while (n1 != n2) {
                n1 = n1.next;
                n2 = n2.next;
            }
            return n1;
        }
    }
}
