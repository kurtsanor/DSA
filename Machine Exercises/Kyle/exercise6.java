import java.util.Stack;

public class exercise6 {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push three elements onto the stack
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Pop elements from the stack and print them
        System.out.println("Popped elements (LIFO order):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // true
    }
}
