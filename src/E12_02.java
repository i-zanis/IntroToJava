import java.util.InputMismatchException;
import java.util.Scanner;

public class E12_02 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the preferred month: ");
        int answer = 0;
            try {
                answer = input.nextInt();
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                System.out.println("Wrong number!");
            }
            catch (InputMismatchException ex) {
                System.out.println("Wrong number!");
            }

        System.out.println(months[answer + 1] + " has " + dom[answer + 1] + " days" );
    }
}

