package Stack;

import java.util.Stack;

public class StackExercise1 {
    public static void main(String[] args) {
        // Example inputs
        String parentheses1 = "(((())))";
        String parentheses2 = "(()(()))";
        String parentheses3 = "(()";
        String parentheses4 = "()";

        // Check if they are balanced
        System.out.println(isBalanced(parentheses1)); // true
        System.out.println(isBalanced(parentheses2)); // true
        System.out.println(isBalanced(parentheses3)); // false
        System.out.println(isBalanced(parentheses4)); // true
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>(); // Step 1: Create a stack

        for (char ch : str.toCharArray()) { // Step 2: Go through each character
            if (ch == '(') {
                stack.push(ch); // Push opening parenthesis onto the stack
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // No opening parenthesis to match
                }
                stack.pop(); // Remove the last opening parenthesis
            }
        }

        // Step 3: Check if the stack is empty at the end
        return stack.isEmpty(); // If empty, it’s balanced
    }
}
