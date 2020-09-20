import java.io.File;
import java.util.Scanner;

import static java.lang.Character.isLetterOrDigit;

public class E12_13 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file doesn't exist.");
            System.exit(2);
        }
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        char space = ' ';
        StringBuilder buffer = new StringBuilder();
        Scanner input = new Scanner(file);
        while(input.hasNext()) {
            String s = input.nextLine();
             lineCount++;
             if (isLetterOrDigit(s.charAt(s.length() -1))) wordCount++;
            for (int i = 0; i < s.length(); i++) {
                if (isLetterOrDigit(s.charAt(i))) charCount++;
                if (s.charAt(i) == space) wordCount++;
                }
            }
        input.close();
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);

    }
    }

