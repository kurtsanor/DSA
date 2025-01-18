import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Create a queue to represent the line
        Queue<String> line = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        System.out.println("Welcome to the Store/Bank Queue Simulation!");
        System.out.println("Commands: 'join', 'serve', 'exit'");

        // Run the loop until the user exits
        while (!done) {
            System.out.print("\nEnter a command: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "join":
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    line.add(name);
                    System.out.println(name + " has joined the line.");
                    break;

                case "serve":
                    if (line.isEmpty()) {
                        System.out.println("The line is empty. No one to serve!");
                    } else {
                        String servedCustomer = line.remove();
                        System.out.println(servedCustomer + " has been served.");
                    }
                    break;

                case "exit":
                    System.out.println("Exiting the program. Thank you!");
                    done = true;
                    break;

                default:
                    System.out.println("Invalid command. Please enter 'join', 'serve', or 'exit'.");
                    break;
            }

            // Print the current state of the line
            System.out.println("Current line: " + line);
        }

        scanner.close();
    }
}
