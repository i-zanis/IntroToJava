import java.util.ArrayList;

import static java.util.Collections.swap;

public class E13_03 {
    public static void main(String[] args) {

    }
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i+1; j<list.size()-1;j++) {
                if (list.get(j) < list.get(min)) min = j;
                swap(list,i,min);
            }
        }
    }
}
