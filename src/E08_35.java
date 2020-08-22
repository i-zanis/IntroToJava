public class E08_35 {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 0, 0, 0},
                            {1, 1, 1, 1},
                            {1, 1, 1, 0},
                            {0, 0, 1, 1}};
        findLargestBlock(matrix);
    }
public static int findLargestBlock(int[][] m) {
    for (int i = 0; i < m.length -1 ; i ++) {
        int indexI = i;
        for (int j = 0; j < m.length -1; j++) {
            int indexJ = j;
            if (m[i][j] == 1 && m[i][j+1] == 1 && m[i+1][j] == 1 && m[i+1][j + 1] == 1) {
                System.out.print(" The square starts at " + i + "," + j);
            }
        }
        }
    return 1;
    }
}
