import java.util.Scanner;

public class E08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[][] matrix = new int[2][2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextInt();
                sum += matrix[row][col];
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++){
                System.out.println(matrix[row][col]);
            }
        }
        System.out.println(sum);
    }
}
