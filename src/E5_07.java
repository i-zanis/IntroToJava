public class E5_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        for (int i = 0; i<10; i++) {
            tuition += tuition * 0.06;
        }
        System.out.println("After 10 years the tuition is " + tuition);
    }
}
