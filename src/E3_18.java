import java.util.Scanner;

public class E3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package.");
        int packageW = input.nextInt();

        if (packageW > 0 && packageW <= 2) {
            System.out.println("The price is 2.5 dollars.");
        }

        if (packageW > 2 && packageW <= 4) {
            System.out.println("The price is 4.5 dollars");
        }
        if (packageW > 4 && packageW <= 10) {
            System.out.println("The price is 7.5 dollars");
        }
        if (packageW > 10 && packageW <= 20) {
            System.out.println("The price is 10.5 dollars");
        }
        if (packageW > 20) {
            System.out.println("We cannot ship the item");
        }
    }
}
