
import java.sql.SQLOutput;
import java.util.Scanner;

public class E5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = input.nextInt();

        System.out.print("The 16 bits are ");
        int mask = 1;
        for (int i = 15; i >=0; i--) {
            int temp = value >> i;
            int bit = temp & mask;
            System.out.print(bit);
        }
    }

}
