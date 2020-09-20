import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E12_14 {
    public static void main(String[] args) {

    }

    public static int readInFile(String line, File file) throws FileNotFoundException {
        int count = 0;
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                count++;
                String s = input.nextLine();
                if (s.contains(line)) return count;
            }
            return -1;
        }
    }

/**(Reading in a sorted file) Write a method public static int
 readInFile(String line, File file) that returns the position number
 of a line in the file filename or −1 if there is no such line or file.
 We assume that this file contains names of people with a name per line.
 Names (and hence lines) are listed in ascending alphabetical order in the file.
 We can not find the same line twice.*/
