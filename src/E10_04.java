public class E10_04 {
    public static void main(String[] args) {
    MyPoint test1 = new MyPoint();
    MyPoint test2 = new MyPoint(10, 30.5);

    System.out.println();
    }
}
class MyPoint {
    private double x;
    private double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(double new_x, double new_y) {
        x = new_x;
        y = new_y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double new_x) {
        x = new_x;
    }

    public void setY(double new_y) {
        y = new_y;
    }
    public double distance(double new_x, double new_y) {
        return Math.sqrt((new_x - x)*(new_x - x) + (new_y - y) * (new_y - y));
    }
    public static double distanceNow(MyPoint point1, MyPoint point2) {
        return Math.sqrt((point2.getX() - point1.getX())*(point2.getX() - point1.getX()) + (point2.getY() - point2.getY()) * (point2.getY() - point2.getY()));
    }

}
