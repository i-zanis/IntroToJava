import java.util.Scanner;

public class E4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN:");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if ((i == 3 || i == 6) && s.charAt(i) == '-') {
                continue;
            }
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println(s + " is an invalid social security number");
                System.exit(0);
            }
        }

        System.out.println(s + " is a valid social security number");
    }

}