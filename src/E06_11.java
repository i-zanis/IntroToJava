public class E06_11 {
    public static void main(String[] args) {
    computeCommission(10000);
    }
    public static void computeCommission(double salesAmount) {

        System.out.printf("%10s %10s", "Sales Amount", "Commission");
        System.out.println();
        for (int i = 0; i < 25; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int j = 1; j <=10; j++) {
            System.out.printf("%10.2f %10.2f", j * salesAmount, j * salesAmount * 90/100);
            System.out.println();
        }

 }
}
