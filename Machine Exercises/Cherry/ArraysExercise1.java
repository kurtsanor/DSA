public class ArraysExercise1 {
    public static void main(String[] args) {
        // step 1: this stores the numbers
        int[] numbers = { 25, 4, 16, 9, 10 };

        // step 2: start with an empty total
        int sum = 0;

        // step 3: add each number to the total
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // step 4: show the results (this prints it out)
        System.out.println("The sum of the array is: " + sum);
    }
}