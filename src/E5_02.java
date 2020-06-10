import java.util.Scanner;

public class E5_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 5;
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        int guess = 0;

        while (i != 0)
        {
            number1 = (int)(1 + Math.random() * 12);
            number2 = (int)(1 + Math.random() * 12);
            result = number1 * number2;
            System.out.println("What is the result of " + number1 + " * " + number2 + " ?");
            guess = input.nextInt();
            if (guess == result) {
                System.out.println("You have guessed right. The result of " + number1 + " * " + number2 + " is " + result + ".");
            }
            else {
                System.out.println("You have failed us");
            }
            i--;
        }
    }
}
