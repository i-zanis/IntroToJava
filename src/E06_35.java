public class E06_35 {
    public static void main(String[] args) {
        System.out.println(area(15.2));
    }
    public static double area(double side) {
        double area = (5 * Math.pow(side, 2))/( 4 * Math.tan(Math.PI/5));
        return area;
    }
}
