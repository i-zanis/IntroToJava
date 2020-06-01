import java.util.Scanner;

public class E4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double side = 2 * length * Math.sin(Math.PI/5);
        double area = (5*Math.pow(side,2))/(4*Math.tan(Math.PI/5));
        area = Math.round(area * 100) / 100.0;
        System.out.println("The area of pentagon is " + area);
    }
}
