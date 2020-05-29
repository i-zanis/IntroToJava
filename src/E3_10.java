import java.util.Scanner;

public class E3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = (int) (Math.random() * 1000);
        int second = (int) (Math.random() * 1000);
        int mul = first * second;
        System.out.println("The numbers are " + first + " and " + second + "=== ??? Type the answer");
        int guess = input.nextInt();

        if (guess == mul) {
            System.out.println("You have guessed it right!");
        } else System.out.println("You suck dix.");
    }

}



/*(Game: multiplication quiz)  Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 Revise the program to randomly generate a multiplication question with two integers less than 1000.*/
