public class Palindrome {
    public static void main(String[] args) {
        LinkedList test = new LinkedList(1);
        test.append(2);
        test.append(3);
        test.append(3);
        test.append(3);
        test.append(2);
        test.append(1);

        if (checkPalindrome(test)) {
            System.out.println("The linked list is a palindrome.");
        }
        else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(LinkedList test) {
        Node n = null, p;
        Node currOne = test.head;
        while (currOne != null) {
            p = n;
            n = new Node(currOne.data);
            n.next = p;
            currOne = currOne.next;
        }
        currOne = test.head;
        while (currOne != null) {
            if (currOne.data != n.data) {
                return false;
            }
            currOne = currOne.next;
            n = n.next;
        }
        return true;
    }
}
