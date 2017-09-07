public class KthToLast {
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

        int ret = kthToLast(7, test);
        System.out.println(ret);
    }

    // assuming k = 1 passes back the last node's data
    private static int kthToLast(int k, LinkedList test) {
        int count = 0;
        Node currNode = test.head;
        while (currNode != null) {
            currNode = currNode.next;
            count++;
        }
        int target = count - k;
        count = 0;
        currNode = test.head;
        while (count < target) {
            currNode = currNode.next;
            count++;
        }
        return currNode.data;
    }
}
