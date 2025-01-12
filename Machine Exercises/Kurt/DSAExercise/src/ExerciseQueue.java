import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerciseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue <String> queue = new LinkedList<>();

        boolean open = true;

        while (open) {
            System.out.println("Enter a command (join, serve, exit");
            String command = sc.nextLine();

            switch (command) {
                case "join":
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    queue.add(name);
                    System.out.println("Welcome "+name);
                    break;
                case "serve":
                    if (!queue.isEmpty()) {
                        String person = queue.poll();
                        System.out.println("You served "+ person);
                    } else System.out.println("There is no person to serve");
                    break;
                case "exit":
                    open = false;
                    break;
            }
        }
    }
}
