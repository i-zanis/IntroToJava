import java.util.ArrayList;

public class E13_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
    }
    public double getAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
 return sum/list.size();
    }
}

