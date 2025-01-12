package BubbleSort;

public class BubbleSortExercise {
    public static void main(String[] args) {
        // Input: Array of integers
        int[] arr = { 5, 2, 9, 1, 6 };

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for passes
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparisons
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if the first is greater than the second
                    int temp = arr[j]; // Temporary variable for swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output: Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
