public class test {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {11, 2, 18, 4, 99, 6},
                {1, 44, 7, 4, 5, 6},
                {1, 92, 3, 4, 5, 6},
                {1, 22, 32, 4, 5, 6},
                {9, 78, 89, 96, 5, 88},
                {91, 2, 7, 4, 5, 9}};

        /**for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[i][1]);
        }*/
       iterate(matrix[5]);
    }
    public static void iterate(int[] m) {
        for (int i = 0; i< m.length; i++) {
            System.out.println(m[i]);
        }
    }
}

