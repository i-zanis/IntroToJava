public class E08_19 {
    public static void main(String[] args) {

        int[][] matrix = {{0,1,0,3,1,6,1},
                {07,17,67,87,67,07,17},
                {3,3,3,3,3,12,19},
                {56,55,56,51,51,59,51},
                {71,73,76,71,74,78,77},
                {3,3,3,3,4,0,7}};
        isConsecutiveFour(matrix);
    }

    public static boolean isConsecutiveFour(int[][] values) {
        boolean majordiagonal = true;
        boolean vertical = true;
        boolean subdiagonal = true;
        boolean horizontal = true;
        //majordiagonal
        int N = values.length;
        for (int i = 0; i < N - 4; i++) {
            majordiagonal = true;
            for (int j = i; j < i + 4; j++)
                if (values[j][j] == values[j + 1][j + 1]) {
                    System.out.println("check");
                }
        }
        System.out.println("majordiagonal is " + majordiagonal);
        //subdiagonal
        for (int i = 0; i < N - 4; i++) {
            subdiagonal = true;
            for (int j = i; j < i + 4; j++)
                if (values[i + 4 - j][i + 4 - j] !=
                        values[i + 4 - j - 1][i + 4 - j - 1]) {
                    subdiagonal = false;
                    break;
                }
        }
        System.out.println("subdiagonal is " + subdiagonal);
        //vertical
        for (int j = 0; j < N - 4; j++) {
            vertical = true;
            for (int i = j; i < j + 4; i++)
                if (values[i][j] != values[i + 1][j]) {
                    vertical = false;
                    break;
                }
        }
        System.out.println("vertical is " + vertical);
        //horizontal
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < i + 4; j++) {
                System.out.println(values[i][j]);
                if (values[i][j] == values[i][j + 1]) {
                    System.out.println("check");
                }
            }
        }
        System.out.println("horizontal is " + horizontal);
        return false;
    }
}
