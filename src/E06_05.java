public class E06_05 {
    public static void main(String[] args) {
        displaySortedNumbers(0.5, 1.2, 10.0);
        displaySortedNumbers(25, 20, 10.0);
        displaySortedNumbers(1, 2, 0.5);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp = 0.0;
        if (num2 > num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 > num2) {
            temp = num2;
            num2 = num3;
            num2 = temp;
        }
        if (num3 > num1) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
