import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class E12_23 {
 public static void main(String[] args) {
     int number = 0;
     double sum = 0;
             try {
                URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
                 Scanner input = new Scanner(url.openStream());
                 while(input.hasNext()) {
                     number++;
                     sum+= input.nextInt();
                 }
                 input.close();
                }
             catch (MalformedURLException ex) {
                System.out.println("Invalid URL");
                }
            catch (IOException ex) {
                 System.out.println("I/O Errors: no such file");
                 }
     System.out.println("The average is " + sum/number);
           }
}

