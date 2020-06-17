import java.util.Scanner;

public class E5_17 {
    public static void main(String[] args) {
        System.out.println("Enter number of lines");
        Scanner input = new Scanner(System.in);
        int number = 15;
        for (int i = number; i > 0; i--) {
            System.out.print(i);
            if (i == 1) {
                for (int j = 2; j <= number; j++)
                {System.out.print((j!=number) ? j : j + "\n");}
                i = number;
                number = number - 1;

            }

        }

    }
}
