import java.util.ArrayList;

public class E11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(1);
        for (int value: list) {
            System.out.println(list.get(value));
        }
        removeDuplicate(list);

        for (int value: list) {
            System.out.println(list.get(value));
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() -1 ; i++) {
            for (int j = i; j < j + 1; i++)
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
        }
    }
}

/** (Remove duplicates) Write a method that removes the duplicate elements from
 an array list of integers using the following header:
 public static void removeDuplicate(ArrayList<Integer> list)
 Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers in their input order and separated by exactly one space.
 Here is a sample run: */
