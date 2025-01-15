public class SumArray {

    public static void main(String[] args) {
        // Define the array with given elements
        int[] numbers = {25, 4, 16, 9, 10};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the result
        System.out.println("The sum of the array elements is: " + sum);
    }
} 
