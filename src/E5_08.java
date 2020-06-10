import java.util.Scanner;

public class E5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name and grade separated by space: ");

        char k = ' ';
        String student1 = input.next();
        String student2 = input.next();
        String student3 = input.next();

        if (student1.indexOf(k+1) > student1.indexOf(k+1)) {
            System.out.println("bigger");
        }
    }
}
