public class ArrayExercises2 {
    public static void main(String[] args) {
        // step 1: make the list
        int[] numbers = { 25, 4, 16, 9, 10 };

        // step 2: decide what to look for, on this one we're looking for number 10
        int target = 10;

        // step 3: check every item if it contains number 10
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) { // found the number
                found = true;
                break;
            }
        }

        // step 4: say if it found the number or not
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found!");
        }
    }
}