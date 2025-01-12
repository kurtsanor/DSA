package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise {
    public static void main(String[] args) {
        // Create a queue for customers
        Queue<String> customerQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Welcome to the Queue Management System!");

        // Loop until the user decides to exit
        while (isRunning) {
            System.out.println("\nOptions: 'add', 'process', 'exit'");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine().trim().toLowerCase();

            switch (choice) {
                case "add":
                    // Ask for the customer's name and add them to the queue
                    System.out.print("Enter the customer's name: ");
                    String customerName = input.nextLine();
                    customerQueue.offer(customerName);
                    System.out.println(customerName + " has been added to the queue.");
                    break;

                case "process":
                    // Serve the next customer in line
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is empty. No customers to process.");
                    } else {
                        String servedCustomer = customerQueue.poll();
                        System.out.println(servedCustomer + " has been served.");
                    }
                    break;

                case "exit":
                    // Exit the program
                    System.out.println("Exiting the system. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    // Handle invalid commands
                    System.out.println("Invalid option. Please choose 'add', 'process', or 'exit'.");
            }
        }

        input.close();
    }

}
