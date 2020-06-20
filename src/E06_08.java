public class E06_08 {
    public static void main(String[] args) {
        kToM(5);
    }
    public static double kToM (double km) {
        System.out.printf("%-8s %-8s %2s", "Miles", "Kilometers", "| \n");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <=10; i++)
            System.out.printf("%-8d %-8.1f %5s", i, i * 1.6, "| \n");
        return 1;
    }
}
