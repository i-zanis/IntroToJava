import java.util.Scanner;

public class E4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("The length is " + s.length() + ".");
        System.out.println("The last char is " + s.charAt(s.length() -1));
    }
}
