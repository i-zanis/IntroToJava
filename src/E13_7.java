public class E13_7 {
    public static void main(String[] args) {

    }
    public interface Colorable {
        public void howToColor();


    }
    public class Square extends E13_06.GeometricObject implements Colorable {
double side;
public double getSide() {
    return side;
}
Square (double side) {
    this.side = side;
}
Square() {
    this.side = 0;
}
public void setSide(double side) {
    this.side = side;
}
        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }

        @Override
        public void howToColor() {
            System.out.println("Color for all four sides");

        }
    }
}
