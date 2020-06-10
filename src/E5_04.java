public class E5_04 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "Inches", "Centimetres");

        for (double i = 1; i<11; i++){
            System.out.printf("%-10.2f %-10.2f\n", i, i * 2.54);
        }

    }
}
