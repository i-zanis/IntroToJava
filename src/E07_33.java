import java.util.Scanner;
public class E07_33 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a month: ");
            int month = input.nextInt();
            int index = (month - 1  % 13);
            String[] year = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println(year[index]);
        }
    }
