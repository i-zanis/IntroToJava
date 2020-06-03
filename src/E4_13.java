

import java.util.Scanner;

public class E4_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();

        // Check if the string has exactly one character
        if (s.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Check if input is valid
        char ch = Character.toUpperCase(s.charAt(0));
        if (ch > 'Z' || ch < 'A') {
            System.out.println(s + " is an invalid input");
            System.exit(1);
        }

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(s + " is a vowel");
            System.exit(1);
        }
        System.out.println(s + " is a consonant");

    }

}