public class E09_13 {
    public static void main(String[] args) {
        double[][] matrix = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6},
                {4.5, 3, 45, 3.5}};
        int N = 4;

        Location x = Location.locateLargest(matrix);
        System.out.println(x.toString());
    }
}
class Location {
    public int row;
    public int column;
    public double maxValue;

    Location(int newRow, int newColumn, double newMaxValue) {
        row = newRow;
        column = newColumn;
        maxValue = newMaxValue;
    }

    @Override
    public String toString() {
        return  "The location of the largest element is " + maxValue + " at "
                + row + ", " + column;
    }

    public static Location locateLargest(double[][] a) {
        int N = a.length;
        double max = a[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        return new Location(indexI, indexJ, max);
    }
}