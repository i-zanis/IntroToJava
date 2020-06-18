public class E5_35 {
    public static void main(String[] args) {
        double sum = 0;

        for (int j = 1; j <= 1000;j++) {
            sum += (1)/(Math.sqrt(j) + Math.sqrt(j + 1));;
        }
        System.out.println("The sum is " + sum);
    }
}
