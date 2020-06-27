import java.util.Scanner;

public class E07_01 {
    public static void main(String[] args) {
        int[] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int sNumber = input.nextInt();
        array = new int[sNumber];
        for (int i = 0; i < sNumber; i++) {
            int score = input.nextInt();
            array[i] = score;
        }
        for (int i = 0; i < sNumber; i++) {
            System.out.println("Student " + (i + 1) + " score is " + array[i]);


        }
    }
}
