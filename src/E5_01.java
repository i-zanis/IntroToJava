import java.util.Scanner;

public class E5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();

        if (score == -1) {
            System.exit(0);
        }
        if (score >= 60) {
            System.out.println("You passed the exam.");
        }
        else {
            System.out.println("You didn't pass the exam.");
        }

    }
}
