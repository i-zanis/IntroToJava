public class E5_38 {
    public static void main(String[] args) {
        int decimal = 500;
        String octal = "";

        while (decimal !=0) {
            int remainder = decimal % 8;
            octal = remainder + octal + "";
            decimal /=8;
        }
        System.out.println(octal);
    }
}
