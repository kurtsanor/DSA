package Stack;

import java.util.Stack;

public class StackExercise2 {
    public static void main(String[] args) {
        // Step 1: Create a stack
        Stack<String> stack = new Stack<>();

        // Step 2: Push elements onto the stack
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Step 3: Pop elements from the stack and print them
        System.out.println("Popped: " + stack.pop()); // Charlie comes off first
        System.out.println("Popped: " + stack.pop()); // Then Bob
        System.out.println("Popped: " + stack.pop()); // Finally Alice

        // Step 4: Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should be true
    }
}
