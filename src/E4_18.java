import java.util.Scanner;

public class E4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter char: ");
        String a = input.next();
        System.out.println("Enter number: ");
        int b = input.nextInt();
        String s = "";

        switch (a.toUpperCase()) {
            case "I":
                a = "Information Management ";
            case "C":
                a = "Computer Science ";
            case "A":
                a = "Accounting ";
            default:
                System.out.println("Enter the code again");

        }

        switch (b) {
            case 1:
                s = "Sophomore";
            case 2:
                s = "Freshman";
            case 3:
                s = "Junior";
            case 4:
                s = "Senior";
        }
        System.out.println("The student is " + a + s);
    }
}
