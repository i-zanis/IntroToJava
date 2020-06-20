public class E06_11 {
    public static void main(String[] args) {

    }
    public static double computeCommission(double salesAmount) {
        System.out.printf("%10s, %%10s0", "Sales Amount", "Commission");
        for (int i = 0; i < 15; i++){
            System.out.println("-");
        }
        for (int j = 1; j <=10; j++) {
            System.out.printf("%6d, %6d", j * 10000, j * 10000* 90/100);
        }

 }
}
