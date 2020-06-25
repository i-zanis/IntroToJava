public class E06_17 {
    public static void main(String[] args) {
        printMatrix(5);
        //printMatrix(10);
    }

    public static void printMatrix(int n) {
        for (int i = 1; i < n; i++) {
            System.out.printf("%d  ", (int) (Math.random() * 2));
            for (int j = 1; j < n; j++) {
                System.out.printf("%d  ", (int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}
