import java.util.Scanner;

public class E3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mount of coins");
        double coins = input.nextDouble();
        int remaining = (int) (coins * 100);
        int numberOfDollars = remaining / 100;
        remaining = remaining % 100;
        int numberOfCents = remaining % 100;

        System.out.println("The amount " + coins + " is " + numberOfDollars + ", " + numberOfCents + " cents");
    }
}
