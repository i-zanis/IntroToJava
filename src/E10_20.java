import java.math.BigDecimal;

public class E10_20 {
    public static void main(String[] args) {
        BigDecimal bigDec = new BigDecimal(0);
        for (int i = 1; i < 1001; i++) {
            bigDec = bigDec.add(BigDecimal.valueOf(1/fact(i)));
            if (i== 100 || i == 200 || i == 1000) System.out.println(bigDec);
        }
    }

    public static double fact(int n) {
        double fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        return fact;
    }
}

