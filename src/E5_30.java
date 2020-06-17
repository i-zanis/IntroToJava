import java.rmi.NotBoundException;
import java.util.Scanner;

public class E5_30 {
    public static void main(String[] args) {
        System.out.println("Enter amount of months: ");
        Scanner input = new Scanner(System.in);
        int months = input.nextInt();
        double amount = 0;
        double interest = 0.003125;
        for (int i = months; i > 0; i--) {
            amount += amount * interest + 100;
            System.out.println("The amount for this month is " + amount);
        }
    }}