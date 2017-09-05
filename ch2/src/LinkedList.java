// Implementation of singly linked list

public class LinkedList {
    Node head;

    public LinkedList(int d) {
        head = new Node(d);
    }

    public void append(int d) {
        Node newOne = new Node(d);
        Node currOne = head;
        while (currOne.next != null) {
            currOne = currOne.next;
        }
        currOne.next = newOne;
    }

    // this function removes the first occurrence of the value d
    public void remove(int d) {
        Node currOne = head;
        Node prev = null;
        while (currOne.data != d && currOne != null) {
            prev = currOne;
            currOne = currOne.next;
        }
        if (currOne == null) {
            System.out.println("The value you requested to remove was not in the linked list.");
        }
        else if (prev == null) {
            head = null;
        }
        else {
            prev.next = currOne.next;
        }
    }
}
