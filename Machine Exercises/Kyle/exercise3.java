import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        try (// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in)) {
            // Initialize an array of size 5
            int[] numbers = new int[5];
            int sum = 0;

            // Prompt the user to input 5 integers
            System.out.println("Enter 5 integers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt(); // Store each input in the array
                sum += numbers[i]; // Add the input to the sum
            }

            // Print the total sum
            System.out.println("The sum of the array is: " + sum);
        }
    }
}