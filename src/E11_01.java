public class E11_01 {
    public static void main(String[] args) {
Triangle tri = new Triangle();
        System.out.println(tri.toString());
    }
}
class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    Triangle () {
    }
    Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }
    public double getPerimeter() {
        return Math.sqrt(side1 + side2 + side3);
    }
    public String toString() {
        return "The triangle with sides " + side1 + " " + side2 + " " + side3 + "\nPerimeter: " +
                getPerimeter() + "\nArea: " + getArea();
    }
}

class GeometricObject {
private String color;
private boolean filled;
private java.util.Date dateCreated;

GeometricObject() {
    dateCreated = new java.util.Date();
};
GeometricObject(String color, boolean filled) {
    java.util.Date dateCreated;
    this.color = color;
    this.filled =filled;
}
public String getColor() {
    return color;
}
public void setColor(String newColor) {
    color = newColor;
}
public boolean isFilled() {
    return filled;
}
public void setFilled(boolean filled) {
    this.filled = filled;
}
public String getDateCreated() {
    return "created on " + dateCreated + "\ncolor " + color +
    " and filled: " + filled;
}
}

