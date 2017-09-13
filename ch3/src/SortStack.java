import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(0);

        sortStack(stack);

        int val;
        while(!stack.isEmpty()) {
            val = stack.pop();
            System.out.println(val);
        }
    }

    private static void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        temp.push(stack.pop());

        int count = 1;
        while (!stack.empty()) {
            while (!temp.empty()) {
                
            }
        }
    }
}
