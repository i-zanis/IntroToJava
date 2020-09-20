import java.io.File;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) throws Exception {
        if (args.length !=1) {
            System.out.println("Usage: java test filename");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if(sourceFile.exists()) {
            System.out.println("Source file " + args[0]);
            System.exit(2);
        }
        StringBuilder buffer = new StringBuilder();
        Scanner input = new Scanner(sourceFile);

        while (input.hasNext()) {
            String s = input.nextLine();
            String s1 = s.trim();
            if(s1.charAt(0) == '{') {
    buffer.append(" {");
    if (s1.length() < 1 ) buffer.append("\r\n" + s);
            }
            input.close();
        }
    }
}