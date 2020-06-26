public class E06_36 {
    public static void main(String[] args) {
        System.out.println(area(6,15.2));
    }
    public static double area(int n, double side) {
        return (n * Math.pow(side,2))/ (5 * Math.tan(Math.PI/n));
    }
}
