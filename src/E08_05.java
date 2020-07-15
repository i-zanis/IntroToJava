public class E08_05 {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3}, {1, 2, 3,}, {5, 6, 7}};
        int[][] test2 = {{1, 3, 3}, {0, 1, 3,}, {6, 6, 9}};
        int[][] newMatrix;
        newMatrix = addMatrix(test1, test2);
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.println(newMatrix[i][j]);
            }
        }
    }
    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] newMat = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                newMat[i][j] = a[i][j] + b[i][j];
            }

        }
        return newMat;
    }
}
