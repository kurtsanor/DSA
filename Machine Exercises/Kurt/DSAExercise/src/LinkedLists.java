
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        // Create a list with the following elements - apple, banana, and cherry
        List <String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Print the list using println.
        System.out.println(list);

        // Add orange to the beginning of the list.
        list.add(0, "orange");

        // Print the list again.
        System.out.println(list);

        // Remove an element from the list.
        list.remove("apple");

        // print the list again.
        System.out.println(list);

        // Get an element at a specific index.
        System.out.println(list.get(1));

        // Print the size of the list.
        System.out.println(list.size());

    }

}
