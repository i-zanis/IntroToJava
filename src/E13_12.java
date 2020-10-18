public class E13_12 {
    public static void main(String[] args) {

    }
public static double sumArea(GeometricObject[] a) {
    double sum = 0;
    for (GeometricObject item : a) {
        sum += item.getArea();
    }
    return sum;
}
}