import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();

        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
