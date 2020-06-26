public class E06_37 {
    public static void main(String[] args) {
        System.out.println(format(14,5));
    }
    public static String format(int number, int width) {
        String count = number + "";
        String numberS = number + "";
        for (int i = 0; i < width - count.length(); i++) {
            numberS = '0' + numberS;
        }
        return numberS;
    }
}
