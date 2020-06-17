public class E5_18 {
    public static void main(String[] args) {
        char k = '*';
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
