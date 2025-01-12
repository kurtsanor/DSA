import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {

    }

    public static int Exercise1 (int [] numbers) {
        int sum = 0;

        // add every element in the array to the sum
        for (int num: numbers) {
            sum += num;
        }

        return sum;
    }

    public static boolean Exercise2 (int [] numbers, int value) {
        // loop through the array and if the value is found, return true
        for (int num: numbers) {
            if (num == value) {
                return true;
            }
        }

        // otherwise return false if value is not found in the array
        return false;
    }

    public static void Exercise3 () {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }

        for (int num: array) {
            sum += num;
        }

        System.out.println("The sum is " + sum);

    }


}
