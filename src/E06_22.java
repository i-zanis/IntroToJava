public class E06_22 {
    public static void main(String[] args) {
        System.out.println(findSQR(25));
    }

    public static double findSQR(int n) {
        if (n < 1) {
            return -1;
        }
        double nextGuess = 1;
        for (int i = 1; i < n; i++) {
            nextGuess = (nextGuess + n / nextGuess) / 2;

        }
        return nextGuess;
    }
}

