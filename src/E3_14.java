import java.util.Scanner;

public class E3_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coin = (int) (Math.random() * 2);
        String toss = s.nextLine();
        String after = "";

        if (coin == 1) {
            after = "tails";
        } else after = "heads";

        if (toss == after) {
            System.out.println("You guessed right moadafaka");
        } else {
            System.out.println("Not this time");
        }
    }
}

/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
 */