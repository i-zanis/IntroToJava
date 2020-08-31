import java.util.ArrayList;

public class E11_09 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(findRow(m));
        list.add(findColumn(m));
        for (int value: list)
            System.out.println(value);
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
        for (int i = 0; i < m.length; i++) {
            sum += m[i][col];
        }
        return sum;
    }
    public static int findColumn(int[][] m) {
        int cIndex = -1;
        int sum = 0;
        for (int i = 0; i < m[0].length; i++) {
            int temp = column(m, i);
            if (sum < temp) {
                sum = temp;
                cIndex = i;
            }
        }
        return cIndex;
    }
}
