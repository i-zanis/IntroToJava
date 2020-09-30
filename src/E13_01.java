public class E13_01 {
    public static void main(String[] args) {

    }
}
class Triangle1 extends GeometricObject {
    double side1;
    double side2;
    double side3;
    boolean isFilled = false;
    String color;

    Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3);
        return Math.sqrt(s* (s-side1) * (s-side2) * (s-side3)) ;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public void setColor(String color) {
        if (isFilled) this.color = color;
    }
    public static boolean isTriangle(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

    }


}
