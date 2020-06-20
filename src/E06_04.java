public class E06_04 {
    public static void main(String[] args) {
        int x = reverse(52585);
        System.out.println(x);
        System.out.println(reverse(42424));
    }
    public static int reverse(int number){
        int reverse = 0;
        int digit;

        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }
    return reverse;
    }
}
