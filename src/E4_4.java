import java.util.Scanner;

public class E4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the hexagon.");
        double side = input.nextDouble();
        double area = (6 * Math.pow(side,2))/(4 * Math.tan(Math.PI/6));
        area = Math.round(area*100)/100.0;
        System.out.println("The area of the hexagon is " + area);
    }
}
