public class E5_50 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java.");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print((j % 8 == 0) ? j + " * " + i + " = " + i * j + "\t" + "\n" : j + " * " + i + " = " + i * j + "\t");
                System.out.print((j % 9 == 0) ? "\n\n" : "");
            }
        }
    }
}
