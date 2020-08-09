public class E06_10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10000; i++)
            System.out.println("The number " + i + " is " + isPrime(i));
    }


    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0) {
                return false;
            }
         return true;
         }
    }




