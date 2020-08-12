import java.math.BigInteger;

public class E10_21 {
    public static void main(String[] args) {
        BigInteger bigNum
                = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        while (count < 10) {
            bigNum = bigNum.add(BigInteger.ONE);
            if (bigNum.remainder(BigInteger.valueOf(5)).
                    compareTo(BigInteger.valueOf(0)) == 0 || bigNum.remainder(BigInteger.valueOf(6)).
                    compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println(bigNum);
                count++;
            }
        }
    }
}
