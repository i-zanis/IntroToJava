import java.util.ArrayList;
import java.util.Scanner;

public class E11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter number of inputs: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter input: ");
            integers.add(input.nextInt());
        }
        System.out.println("The largest number is : " + max(integers));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) return null;
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) max = list.get(i);
        }
        return max;
    }
}
/** (Maximum element in ArrayList) Write the following method that returns the
 maximum value in an ArrayList of integers. The method returns null if the
 list is null or the list size is 0.
 public static Integer max(ArrayList<Integer> list)
 Write a test program that prompts the user to enter a sequence of numbers ending
 with 0 and invokes this method to return the largest number in the input.*/