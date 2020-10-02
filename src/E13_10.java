public class E13_10 {
    public static void main(String[] args) {

    }

    class Rectangle extends GeometricObject implements Comparable {
        double side1;
        double side2;

        public double getArea() {
            return side1 * side2;
        }

        public int compareTo(Object o) {
            if (getArea() > ((GeometricObject)o).getArea())
                return 1;
            else if (getArea() < ((GeometricObject)o).getArea())
                return -1;
            else
                return 0;
        }


        }
    }
