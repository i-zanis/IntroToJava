public class E5_15 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 41; i<= 126; i++) {
            System.out.print((counter++ % 10 != 0) ? (char)(i) + " " : (char)(i) + "\n");
        }
    }
}
