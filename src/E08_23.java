public class E08_23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                matrix[i][j] = 0;
                }
            }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                int random = (int)(Math.random() * 6);
                matrix[i][random] = 1;

            }
        }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

