import java.util.Scanner;

public class ArraysExercises3 {
    public static void main(String[] args) {
        // step 1: create a box (array) with 5 slots
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in); // set up Scanner to listen to user input

        // step 2: ask the user to enter 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": "); // ask for a number
            numbers[i] = scanner.nextInt(); // store it in the box
        }

        // step 3: add all the numbers
        int sum = 0; // start with no total
        for (int i = 0; i < 5; i++) {
            sum += numbers[i]; // add each number to the total
        }

        // step 4: show the total
        System.out.println("The sum of the array is: " + sum);

    }
}
