public class E5_10 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 100; i <= 1000; i++)
            if (i % 3 == 0 && i % 4 == 0)
                System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
    }
}
