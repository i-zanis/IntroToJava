public class E5_03 {
    public static void main(String[] args) {
        int counter = 0;

        System.out.printf("%-20s %10s", "Fahrenheit","Celsius\n");
        while (counter != 100) {
            System.out.printf("%-20d %4d\n", counter * 9/5 + 32, counter );
        counter = counter + 2;
        }

    }
    }