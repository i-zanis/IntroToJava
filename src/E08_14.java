import java.util.Scanner;

public class E08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of a square matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        boolean isSameOnARow = false, isSameOnAColumn = false,
                isSameOnADiagonal = false, isSameOnASubdiagonal = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

        // Check rows
        for (int i = 0; i < matrix.length; i++) {
            boolean same = true;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] != matrix[i][j]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + matrix[i][0] + "'s on row " + i);
                isSameOnARow = true;
            }
        }
        // Check columns
        for (int j = 0; j < matrix[0].length; j++) {
            boolean same = true;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[0][j] != matrix[i][j]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + matrix[0][j] + "'s on column " + j);
                isSameOnAColumn = true;
            }
        }

        // Check major diagonal
        boolean same = true;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[0][0] != matrix[i][i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("All " + matrix[0][0] + "'s on major diagonal");
            isSameOnADiagonal = true;
        }

        // Check subdiagonal
        same = true;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[0][matrix.length - 1] != matrix[i][matrix.length - 1 - i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("All " + matrix[0][matrix.length - 1] + "'s on sub-diagonal");
            isSameOnASubdiagonal = true;
        }

        if (!isSameOnARow)
            System.out.println("No same numbers on a row");

        if (!isSameOnAColumn)
            System.out.println("No same numbers on a column");

        if (!isSameOnADiagonal)
            System.out.println("No same numbers on the major diagonal");

        if (!isSameOnASubdiagonal)
            System.out.println("No same numbers on the sub-diagonal");
    }
}

// An alternative version without using break
//import java.util.Scanner;
//
//public class Exercise08_14 {
//  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter the length of a square matrix: ");
//    int n = input.nextInt();
//    
//    int[][] matrix = new int[n][n];
//    boolean isSameOnARow = false, isSameOnAColumn = false,
//      isSameOnADiagonal = false, isSameOnASubdiagonal = false;
//
//    for (int i = 0; i < matrix.length; i++) {
//      for (int j = 0; j < matrix[0].length; j++) {
//        matrix[i][j] = (int) (Math.random() * 2);
//        System.out.print(matrix[i][j]);
//      }
//
//      System.out.println();
//    }
//
//    // Check rows
//    for (int i = 0; i < matrix.length; i++) {
//      boolean same = true;
//      for (int j = 1; j < matrix[0].length && same; j++) {
//        if (matrix[i][0] != matrix[i][j]) {
//          same = false;
//        }
//      }
//      if (same) {
//        System.out.println("All " + matrix[i][0] + "'s on row " + i);
//        isSameOnARow = true;
//      }
//    }
//
//    // Check columns
//    for (int j = 0; j < matrix[0].length; j++) {
//      boolean same = true;
//      for (int i = 1; i < matrix.length && same; i++) {
//        if (matrix[0][j] != matrix[i][j]) {
//          same = false;
//        }
//
//      }
//      if (same) {
//        System.out.println("All " + matrix[0][j] + "'s on column " + j);
//        isSameOnAColumn = true;
//      }
//    }
//
//    // Check major diagonal
//    boolean same = true;
//    for (int i = 1; i < matrix.length && same; i++) {
//      if (matrix[0][0] != matrix[i][i]) {
//        same = false;
//      }
//    }
//    if (same) {
//      System.out.println("All " + matrix[0][0] + "'s on major diagonal");
//      isSameOnADiagonal = true;
//    }
//
//    // Check subdiagonal
//    same = true;
//    for (int i = 1; i < matrix.length && same; i++) {
//      if (matrix[0][matrix.length - 1] != matrix[i][matrix.length - 1 - i]) {
//        same = false;
//      }
//    }
//    if (same) {
//      System.out.println("All " + matrix[0][matrix.length - 1] + "'s on sub-diagonal");
//      isSameOnASubdiagonal = true;
//    }
//    
//    if (!isSameOnARow) 
//      System.out.println("No same numbers on a row");
//
//    if (!isSameOnAColumn) 
//      System.out.println("No same numbers on a column");
//
//    if (!isSameOnADiagonal) 
//      System.out.println("No same numbers on the major diagonal");
//
//    if (!isSameOnASubdiagonal) 
//      System.out.println("No same numbers on the sub-diagonal");
//  }
//}
