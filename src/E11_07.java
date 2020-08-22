import java.util.ArrayList;

public class E11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(500);
        list.add(2);
        for (Object o : list) System.out.println(o);
        shuffle(list);
        for (Object o : list) System.out.println(o);
    }

    public static void shuffle(ArrayList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            int random1 = (int)(Math.random() * list.size());
            int random2 = (int)(Math.random() * list.size());
            temp = list.get(random1);
            list.add(list.get(random1), list.get(random2));
            list.add(list.get(random2), temp);
        }
    }

}
/**(Shuffle ArrayList) Write the following method that shuffles the elements in
 an ArrayList of integers:
 public static void shuffle(ArrayList<Integer> list)*/