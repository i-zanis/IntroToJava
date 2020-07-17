public class E08_13 {
    public static void main(String[] args) {
        final int n = 4;
        double[][] matrix = {
                {33, 23, 3},
                {5, 6, 3},
                {35, 44, 0.1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        int[] x = locateSmallest(matrix);
        for (int i = 0; i < 2; i++) {
            System.out.println(x[i]);
        }

    }
        public static int[] locateSmallest(double[][] a){
            int[] test = new int[2];
            double minJ = 100;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (minJ > a[i][j]) {
                        System.out.println(minJ + " " + a[i][j]);
                        minJ = a[i][j];
                        test[0] = i;
                        test[1] = j;

                    }
                }
            }
            return test;
        }
    }
