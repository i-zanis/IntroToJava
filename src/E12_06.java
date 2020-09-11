public class E12_06 {
    public static void main(String[] args) {
        System.out.println(hex2Dec("A"));
        System.out.println(hex2Dec("B"));

    }


    public static int hex2Dec(String hex) throws NumberFormatException {
        int dec = 0;
        for (int i = 0; i < hex.length(); i++) {
            char digit = hex.charAt(i);
            dec = dec * 16 + hexDigit(digit);
        }
        return dec;
    }

    public static int hexDigit(char hex) {
        if (hex >= 'A' && hex <= 'F') return hex + 10 - 'A';
        else if (hex >= '0' && hex <= '9') return hex - '0';
        else throw new NumberFormatException("The digit is not a Hex digit");
    }
}
