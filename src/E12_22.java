import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E12_22 {
    public static void main(String[] args) throws IOException {
        if(args.length !=3) {
            System.out.println("Usage: java E12_22 dir oldString newString");
            System.exit(1);
        }
        File directory1 = new File(args[0]);
        if(!directory1.exists()) {
            System.out.println("The directory doesn't exist");
            System.exit(2);
        }
        if(!directory1.isDirectory()) {
            System.out.println("The file is not a directory");
            System.exit(3);
        }
        File[] files = directory1.listFiles();
        for (int i = 0; i < files.length; i++) {
            replaceText(files[i],args[1], args[2]);
        }
    }
    public static void replaceText(File name, String oldString, String newString) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(name);
        while(input.hasNext()) {
            String s = input.nextLine();
            s = s.replaceAll(oldString, newString);
            sb.append(s + "\r\n");
        }
        try {
            PrintWriter output = new PrintWriter(name);
            output.print(sb);
            output.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
