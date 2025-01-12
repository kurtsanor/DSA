package InsertionSort;

public class InsertionSortExercise {
    public static void main(String[] args) {
        // Input: Array of integers
        int[] arr = { 5, 2, 9, 1, 6 };

        // Insertion Sort algorithm
        for (int i = 1; i < arr.length; i++) { // Outer loop: Start from the second element
            int key = arr[i]; // The element to be inserted
            int j = i - 1; // Start comparing with the element before 'key'

            // Shift elements of the sorted part to the right if they are greater than 'key'
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--; // Move to the next element on the left
            }

            // Insert 'key' into its correct position
            arr[j + 1] = key;
        }

        // Output: Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
