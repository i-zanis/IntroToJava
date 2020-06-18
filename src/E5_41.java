import java.util.Scanner;

public class E5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        int max = 1;
        int count = 0;

        while (answer !=0) {
            System.out.println("Enter number: ");
            answer = input.nextInt();
            if (max < answer) {
                max = answer;
                count = 1;
            }
            if (max == answer) {
                count++;
            }
        }
        System.out.println("The max is: " + max + ".\nIt's occurrences are " + count +".");
    }
}
