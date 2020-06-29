public class E5_24 {
    public static void main(String[] args) {

        double i = 1.0;
        double j = 3.0;
        double sum = 0.0;
        for (; j < 99.0;) {
            sum = sum + i/j;
            i = i + 2;
            j = j + 2;
        }
        System.out.println(sum);
    }
}
