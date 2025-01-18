public class exercise2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int valueToCheck = 30;

        boolean containsValue = false;

        for (int num : arr) {
            if (num == valueToCheck) {
                containsValue = true;
                break;
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value " + valueToCheck + ".");
        } else {
            System.out.println("The array does not contain the value " + valueToCheck + ".");
        }
    }
}
