public class E08_25 {
    public static void main(String[] args) {
        double[][] matrix = {{0.5, 1.0, 0.1},
                            {0.4, 0.0, 0.9},
                            {0.1,0.0,0.0}};
        int count = 0;
        for (int i = 0; i < 3; i++) {
            checkColumn(matrix, i);
            count++;
            if (count > 2) System.out.println("The columns check is passed");
        }
        System.out.println(isPositive(matrix) ? "The numbers are positive" : "There is a negative number in the matrix");
    }
    public static boolean isPositive(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] < 0) return false;
            }
        }
        return true;
    }
    public static boolean checkColumn (double[][] matrix, int column) {
        double sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][column];
            }
            if (sum != 1) return false;
        return true;
    }

}
