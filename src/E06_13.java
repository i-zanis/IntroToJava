public class E06_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n","i", "m(i)");
        System.out.println(String.format("%20s", "").replace(' ', '-'));
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-10.4f\n",i,sum(i));
        }

    }

    public static double sum(int n) {
        double sum=0;
        for (int i = 1; i <= n; i++) {
            sum+= 1.0*i/(i+1);
        }
        return sum;

    }

}