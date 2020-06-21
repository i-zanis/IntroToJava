import java.util.Scanner;

public class E4_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        String amount = input.next();

        int k = '.';
        int dollars = Integer.parseInt(amount.substring(0, amount.indexOf(k)));
        int cents = Integer.parseInt(amount.substring( amount.indexOf(k)+1));
       
        System.out.println(dollars);
        System.out.println(cents);


    }
}
