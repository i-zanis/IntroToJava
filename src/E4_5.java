import java.util.Scanner;

public class E4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length.");
        double s = input.nextDouble();
        System.out.println("Enter number of sides.");
        double nSides = input.nextDouble();
        double area = (nSides * Math.pow(s,2))/(4*Math.tan(Math.PI/nSides));
        System.out.println("The area is " + area + ".");
    }
}
