public class E06_29 {
    public static void main(String[] args) {
        int beforePrime = 2;
        for (int i = 2; i <= 1200; i++){
            if (isPrime(i)) {
                if (i > 3) {
                    System.out.printf("%(1d, %1d)\n", beforePrime, i);
                }
                beforePrime = i;
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
