import java.util.Scanner;

public class E5_39 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter commission amount:");
            double commissionSought = input.nextDouble();
            double sale;

            if (commissionSought <= 400) {
                sale = commissionSought / 0.08;

            } else if (commissionSought <= 900) {
                sale = (commissionSought - 400) / 0.1 + 5000;
            } else {
                sale = (commissionSought - 900) / 0.12 + 10000;
            }

            System.out.println("The sale you need to generate is " + sale);

        }

    }