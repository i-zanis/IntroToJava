public class E06_27 {
    public static void main(String[] args) {
        int count = 120;
        for (int i = 2; i < 100000; i++)
        if (isPrime(i)) {
            if (isPalindrome(i) && count !=0) {
                System.out.printf(((count-- - 1) % 8 == 0) ? "%10d\n" : "%10d",i, i);
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
    public static boolean isPalindrome(int number) {
        String numberS = number + "";
        int N = numberS.length();
        for (int i = 0; i < N/2; i++) {
            if (numberS.charAt(i) != numberS.charAt(N-1-i)){
                return false;
            }
        }
        return true;
    }
}
