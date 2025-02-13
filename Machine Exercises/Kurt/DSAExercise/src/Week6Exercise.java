import java.util.HashMap;
import java.util.Map;

public class Week6Exercise {

    public char firstNonRepeatingLetter (String word) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char letter: word.toCharArray()) {
            frequencies.put(letter,frequencies.getOrDefault(letter,0)+1);
        }
        for (char letter: word.toCharArray()) {
            if (frequencies.get(letter) == 1) {
                return letter;
            }
        }
        return ' ';
    }

    public int maxElement (int [] array) {
        int max = 0;

        for (int num: array) {
            if (num > max) max = num;
        }
        return max;
    }


}
