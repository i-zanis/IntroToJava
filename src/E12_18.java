import java.io.File;
import java.util.Scanner;

public class E12_18 {
    public static void main(String[] args) throws Exception{
        if(args.length != 1) {
            System.out.println("Usage E12_18 srcRootDirectory");
            System.exit(0);
        }
        File sourceFile = new File("C:\\Users\\JEITI\\IdeaProjects\\IntroJava\\src");
        System.out.println(sourceFile.listFiles());

        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(sourceFile);
        while(input.hasNext()) {
            String s = input.nextLine();
            sb.append(s);
            sb.append("\r\n");
        }
        input.close();
        sb.toString();
    }
}
