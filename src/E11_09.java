public class E11_09 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1}};
        System.out.println("The row with most 1's is: " + findRow(m));
    }

    public static int findRow(int[][] m) {
        int row = 0;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            int temp = row(m[i]);
            if (sum < temp) {
                sum = temp;
                row = i;
            }
        }
        return row;
    }

    public static int row(int[] m) {
        int sum = 0;
        for (int value : m) sum += value;
        return sum;
    }

    public static int column(int[][] m, int col) {
        int sum = 0;
        for (int[] ints : m) {
            sum += ints[col];
        }
    }
}
public static int findColum(int[][] m) {

}

