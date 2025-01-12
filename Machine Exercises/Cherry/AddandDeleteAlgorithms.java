package AddandDeleteAlgorithms;

import java.util.ArrayList;

public class AddandDeleteAlgorithms {
    // List to store unique numbers
    private ArrayList<Integer> numbers;

    // Constructor initializes the list
    public AddandDeleteAlgorithms() {
        numbers = new ArrayList<>();
    }

    // Method to add a number if it doesn't exist in the list
    public String addNumber(int num) {
        if (!numbers.contains(num)) { // Check if the number is NOT in the list
            numbers.add(num); // Add the number to the list
            return "Added: " + num;
        } else {
            return num + " is already in the list";
        }
    }

    // Method to remove a number if it exists in the list
    public String removeNumber(int num) {
        if (numbers.contains(num)) { // Check if the number is in the list
            numbers.remove(Integer.valueOf(num)); // Remove the number from the list
            return "Removed: " + num;
        } else {
            return num + " is not in the list";
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of the UniqueNumberList class
        AddandDeleteAlgorithms uniqueList = new AddandDeleteAlgorithms();

        // Test the addNumber method
        System.out.println(uniqueList.addNumber(10)); // Adds 10
        System.out.println(uniqueList.addNumber(20)); // Adds 20
        System.out.println(uniqueList.addNumber(10)); // Says 10 is already in the list

        // Test the removeNumber method
        System.out.println(uniqueList.removeNumber(10)); // Removes 10
        System.out.println(uniqueList.removeNumber(30)); // Says 30 is not in the list
    }
}
