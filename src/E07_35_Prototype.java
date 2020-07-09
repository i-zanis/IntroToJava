import java.util.Scanner;

public class E07_35_Prototype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"maria", "sandra", "sea", "aspen", "gold", "Brahmaputra", "Chonticha"};
        String word = words[(int) (Math.random() * 6)];
        char[] chosenW = word.toCharArray();
        char[] displayedW = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            displayedW[i] = '*';
        }
        char guess = ' ';


        //while (guess !='0') {
        int randomNumber = (int) (Math.random() * displayedW.length);
        displayedW[randomNumber] = chosenW[randomNumber];
        System.out.println("Find the name of the girl.");
        while (!(displayedW.toString()).contains("*")) {
            System.out.println(displayedW);
            System.out.println("Enter char: ");
            guess = input.next().charAt(0);

            for (int i = 0; i < displayedW.length; i++) {
                if ((displayedW[i]) == '*' && chosenW[i] == guess) {
                    displayedW[i] = chosenW[i];
                }
            }
            System.out.println(displayedW);

        }
    }
}

