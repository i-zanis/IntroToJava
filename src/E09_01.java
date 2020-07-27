public class E09_01 {
    public static void main(String[] args) {
        rectangle[] rectangles = new rectangle[2];
        rectangles[0] = new rectangle(4, 40);
        rectangles[1] = new rectangle(3.5, 35.9);

        for (int i = 0; i < 2; i++) {
            System.out.println("Rectangle" + (i + 1) + ":");
            System.out.println("Area = " + rectangles[i].getArea());
            System.out.println("Perimeter = " + rectangles[i].getPerimeter());
            System.out.println();
        }

    }

    static class rectangle {
        private double width;
        private double height;

        public rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }

        rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return 2 * this.width + 2 * this.height;
        }

    }
}
