package LinkedList;

import java.util.ArrayList;

public class LinkedListExercise1 {
    public static void main(String[] args) {
        // Step 1: Create a list with elements - apple, banana, cherry
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Step 2: Print the list
        System.out.println("Initial list: " + fruits);

        // Step 3: Add "orange" to the beginning of the list
        fruits.add(0, "orange");

        // Step 4: Print the list again
        System.out.println("After adding 'orange' to the beginning: " + fruits);

        // Step 5: Remove an element from the list (e.g., banana)
        fruits.remove("banana");

        // Step 6: Print the list again
        System.out.println("After removing 'banana': " + fruits);

        // Step 7: Get an element at a specific index (e.g., index 2)
        String element = fruits.get(2);
        System.out.println("Element at index 2: " + element);

        // Step 8: Print the size of the list
        System.out.println("Size of the list: " + fruits.size());
    }
}
