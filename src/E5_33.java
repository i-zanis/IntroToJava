public class E5_33 {
    public static void main(String[] args) {

        // Loop through every number from 1 to 10000
        int sumOfDivisor = 0;
        int numberOfPerfect = 0;

        for (int i = 1; i <= 10000; i++) {
            // Loop through every number from 2 to n-1 , check if it is a
            // divisor of n and calculate the sum
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumOfDivisor += j;
                }
            }

            if (sumOfDivisor == i) {
                System.out.println(i + " is a perfect number");
                numberOfPerfect++;
            }
            //reseting sum for the next loop
            sumOfDivisor = 0;
        }
        System.out.println("Total number of perfect number is "
                + numberOfPerfect);

    }

}