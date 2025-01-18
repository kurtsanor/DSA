import java.util.Stack;

public class exercise5 {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String parentheses1 = "((()))";
        String parentheses2 = "(()())";
        String parentheses3 = "((()";
        String parentheses4 = "())";

        System.out.println("Parentheses 1 is balanced: " + isBalanced(parentheses1)); // true
        System.out.println("Parentheses 2 is balanced: " + isBalanced(parentheses2)); // true
        System.out.println("Parentheses 3 is balanced: " + isBalanced(parentheses3)); // false
        System.out.println("Parentheses 4 is balanced: " + isBalanced(parentheses4)); // false
    }
}
