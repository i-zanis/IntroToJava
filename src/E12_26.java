import java.io.File;

public class E12_26 {
    public static void main(String[] args) {
       String name = "bestDirectory";

       File file = new File("Ismail we win");
       file.mkdir();
       if (!file.exists()) System.out.println("The directory doesn't exist");
       else System.out.println("The directory exists");

    }
}
