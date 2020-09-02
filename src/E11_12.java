import java.util.ArrayList;

public class E11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(0.1);
        list.add(11.0);
        list.add(110.1);

        System.out.println(sum(list));
    }
    static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double e: list) {
            sum += e;
        }
        return sum;
}

}





/**(Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
 public static double sum(ArrayList<Double> list)
 Write a test program that prompts the user to enter five numbers, stores them in
 an array list, and displays their sum.*/
