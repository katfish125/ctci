// Implementation of singly linked list.
// I have yet to go through the "encapsulation" chapter of the textbook,
// so the current implementation for Linked List and Node are not optimal.

public class LinkedList {
    Node head;

    public LinkedList() {}

    public LinkedList(int d) {
        head = new Node(d);
    }

    public void append(int d) {
        if (head == null) {
            head = new Node(d);
        }
        else {
            Node newOne = new Node(d);
            Node currOne = head;
            while (currOne.next != null) {
                currOne = currOne.next;
            }
            currOne.next = newOne;
        }
    }

    // this function removes the first occurrence of the value d
    public void remove(int d) {
        Node currOne = head;
        Node prev = null;
        while (currOne != null && currOne.data != d) {
            prev = currOne;
            currOne = currOne.next;
        }
        if (currOne == null) {
            System.out.println("The value you requested to remove was not in the linked list.");
        }
        else if (prev == null) {
            head = currOne.next;
        }
        else {
            prev.next = currOne.next;
        }
    }

    public void printAll() {
        Node currOne = head;
        while(currOne != null) {
            System.out.println(currOne.data);
            currOne = currOne.next;
        }
    }
}
