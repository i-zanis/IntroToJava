import java.util.Scanner;

public class E08_11 {
    // Strategies:
    // Use binary number and bitwise operator to shift the bit to the right and
    // use masking to extract the last digit
    // Also see exercise 5.44
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        short Input = input.nextShort();
        int[][] matrix = new int[3][3];
        short mask = 0b1;
        for (int i = 0; i < 9; i++) {
            short bit = (short) (Input & mask); // extracting last bit
            matrix[2-i / 3][2-i % 3] = bit;
            Input = (byte) (Input >> 1);
        }

        displayArray(matrix);

    }

    public static void displayArray(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    System.out.print("T ");
                } else {
                    System.out.print("H ");
                }
            }

            System.out.println("");
        }
    }

}