public class Etest {
    public static void main(String[] args) {
        System.out.println(getSize(12345));
    }
    public static int getSize(long d) {
        int numberofDigit = 1;
        while ((d = d/10) != 0) {
            numberofDigit++;

        }
    return numberofDigit;
    }
}
