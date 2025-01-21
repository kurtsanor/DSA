import java.util.LinkedList;
import java.util.List;

public class AddAndDelete {

    public List<Integer> AddandDelete  (int [] array) {
        List <Integer> list = new LinkedList<>();

        for (int num: array) {
            if (list.contains(num)) {
                list.remove((Integer)num);
            }
            else {
                list.add(num);
            }
        }
        return list;
    }

}
