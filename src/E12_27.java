import java.io.File;
public class E12_27 {

    public static void main(String[] args) {

        //Kit.display(args);
        if (args.length == 0) {
            System.out.println("Invalid Arguments.");
            System.out.println("Usage: java Chapter_12.Exercise_27");
            System.exit(1);
        }
        for (String s : args) {

            if (s.matches("E[\\d]_[\\d].*")) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(s.indexOf('_') - 1, "0");
                sb.insert(s.indexOf('_') + 2, "0");
                new File(s).renameTo(new File(sb.toString()));
            }
        }

    }

}