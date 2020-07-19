public class E08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            if (isHorizontal(matrix[i])) {
                System.out.println("Row " + (i+1) + " is " + isHorizontal(matrix[i]));
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            if (isVertical(matrix,i)) {
                System.out.println("Column " + (i+1) + " is " + isVertical(matrix,i));
            }
        }

    }
    public static boolean isHorizontal(int[]row) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += row[i];
        }
        if (sum % 2 != 0) return false;
        return true;
    }
    public static boolean isVertical(int[][] m,int column) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += m[i][column];
        }
        if (sum % 2 != 0) return false;
        return true;
    }
}
