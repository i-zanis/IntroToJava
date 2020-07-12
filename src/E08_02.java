public class E08_02 {
    public static void main(String[] args) {
        double[][] matrix =
                {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {4, 3, 2, 1},
                {8, 7, 6, 5}};
        System.out.println(averageMajorDiagonal(matrix));
    }

    
    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < m.length; i++){
                sum += m[i][i];
                count++;
            }

     return sum/count;
    }
}