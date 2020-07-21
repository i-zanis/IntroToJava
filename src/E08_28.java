public class E08_28 {
    public static void main(String[] args) {
        double[][] matrix = {{33, 23, 3},
                            {5, 6, 3},
                            {35, 44, 0.1}};

        double[][] matrix1 = {{33, 23, 3},
                {5, 6, 3},
                {35, 44, 0.1}};
        System.out.println(equals(matrix,matrix1));
    }
    public static boolean equals(double[][] m, double[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] != m2[i][j]) return false;
            }
        }
        return true;
    }
}

