public class E13_11 {
    public static void main(String[] args) {

    }
    class Octagon extends GeometricObject implements Comparable, Cloneable {
        private double side = 0;

        Octagon() {

        }

        Octagon(double side) {
            this.side = side;
        }

        double getSide() {
            return this.side;
        }

        @Override
        public double getArea() {
            return (2 + 4 / Math.sqrt(2)) * side * side;
        }

        public double getPerimeter() {
            return side * 8;
        }

        @Override
        public int compareTo(Object o) {
            if (getArea() == ((GeometricObject)o).getArea()) return 0;
            if (getArea() > ((GeometricObject)o).getArea()) return 1;
            return -1;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            try {
                return super.clone();
            }
            catch(CloneNotSupportedException ex) {
                return null;
            }
        }
    }
    }
