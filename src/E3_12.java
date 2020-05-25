import java.util.Scanner;

public class E3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();

        int user1 = user / 100;
        int user3 = user % 10;


        if (user1 == user3) {
            System.out.println("its a paldindrome");
        }
    }
}
