import java.io.File;
public class E12_29 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("The argument is invalid");
            System.out.println("Usage: java E12_29 directoryName");
            System.exit(1);
        }

        for (String s : args) {

            if (s.matches("Exercise[\\d]_[\\d].*")) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(s.indexOf('_') + 1, "0");
                new File(s).renameTo(new File(sb.toString()));
            }
        }
    }

}