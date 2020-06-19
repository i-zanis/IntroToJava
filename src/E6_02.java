public class E6_02 {
    public static void main(String[] args) {
        System.out.println(sumDigits(514));
    }
    public static int sumDigits(long n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n % 10;
            n /=10;

        }
        return sum;
    }
}
