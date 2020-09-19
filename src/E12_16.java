import java.io.*;
import java.util.*;

class E12_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Exercise12_16 sourceFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(2);
        }

        StringBuilder sb = new StringBuilder();
        try (Scanner input = new Scanner(sourceFile);) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                sb.append("\r\n" + s2);
            }}
        try (PrintWriter output = new PrintWriter(sourceFile);) {
            output.print("\r\n" + sb.toString());
        }
    }
}
