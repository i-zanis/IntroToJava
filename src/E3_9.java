import java.util.Scanner;

public class E3_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        int isbn = input.nextInt();
        int d1 = isbn / 100000000;
        System.out.println(d1);
    }

}