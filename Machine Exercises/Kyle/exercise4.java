import java.util.LinkedList;

public class exercise4 {
    public static void main(String[] args) {
        // Step 1: Create a list with the elements "apple", "banana", and "cherry"
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Step 2: Print the list
        System.out.println("Initial List: " + fruits);

        // Step 3: Add "orange" to the beginning of the list
        fruits.addFirst("orange");

        // Step 4: Print the list again
        System.out.println("After Adding 'orange' at the beginning: " + fruits);

        // Step 5: Remove an element from the list (e.g., remove "banana")
        fruits.remove("banana");

        // Step 6: Print the list again
        System.out.println("After Removing 'banana': " + fruits);

        // Step 7: Get an element at a specific index (e.g., index 1)
        String elementAtIndex1 = fruits.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Step 8: Print the size of the list
        System.out.println("Size of the list: " + fruits.size());
    }
}
