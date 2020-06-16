import java.util.Scanner;

public class E5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();
        int divisor = 1;
        if (first > second) {
             divisor = second;
        }
        else { divisor = first;}
        for (int i = divisor; i<=divisor; divisor--){
            if (first % divisor == 0 && second % divisor == 0) {
                System.out.println(divisor);
            }
        else {
                System.out.println("There is no common divisor.");
            }
    }
}
}
