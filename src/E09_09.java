public class E09_09 {
    public static void main(String[] args) {
    RegularPolygon poly1 = new RegularPolygon();
    RegularPolygon poly2 = new RegularPolygon(6,4);
    RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println(poly1.getArea());
        System.out.println(poly1.getPerimeter());

        System.out.println(poly2.getArea());
        System.out.println(poly2.getPerimeter());

        System.out.println(poly3.getArea());
        System.out.println(poly3.getPerimeter());
    }
}
class RegularPolygon {
    private int n = 3;
    private double sideL = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon() {

    }
RegularPolygon(int nSides, int sideL) {
        this.n = nSides;
        this.sideL = sideL;
}
    RegularPolygon(int nSides, int sideL, double x, double y) {
        this.n = nSides;
        this.sideL = sideL;
        this.x = x;
        this.y = y;
    }

    public int getNSides() {
        return this.n;
    }
    public void setNSides(int n) {
        this.n = n;
    }
    public double getSideL() {
        return this.sideL;
    }

    public void setSideL(double sideL) {
        this.sideL = sideL;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * sideL;
    }

    public double getArea() {
        return (n * sideL * sideL * sideL)/(4 * Math.tan(Math.PI/n));
    }
}
