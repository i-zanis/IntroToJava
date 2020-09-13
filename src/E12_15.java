import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class E12_15 {
    public static void main(String[] args) throws Exception {
    while(args.length != 1) {
        System.out.println("Usage: java filename");
    }
    File file = new File(args[0]);
    if(!file.exists()) {
        System.out.println("The file " + args[0] + " does not exist");
    }

    }
    public static int writeInFile(String name, File file) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(file);
        //find how to compare the file with the other names
        out.println(name);
        out.close();
    }
}

/** (Writing in a sorted file) Write a method public static int
 writeInFile(String name, File file) that writes name at its correct
 position in file so that it fulfills the assumptions given in Programming Exercise 12.14. The method returns the line position of the name.*/
