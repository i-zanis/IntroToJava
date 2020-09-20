public class E12_07b {
//curly brace convention broken for shorter screenshot
    public static void main(String[] args) {

        System.out.println(bin2Dec("1100100"));
        // Purposely throwing an exception...
        System.out.println(bin2Dec("lafkja"));
    }

    public static int bin2Dec(String bin) {
        int power = 0;
        int decimal = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                decimal += Math.pow(2, power);}
            power++;
        }
        return decimal;
    }
    public static boolean isBinary(String binary) {

        for (char ch : binary.toCharArray()) {
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }
}