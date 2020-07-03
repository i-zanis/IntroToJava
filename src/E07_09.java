public class E07_09 {
    public static void main(String[] args) {
        double[] testray = new double[10];
        for (int i = 0; i < 10; i++) {
            testray[i] = Math.random() * 100;
            System.out.println(testray[i]);
        }
        System.out.println("The max is " + max(testray));
    }
    public static double max(double[] array) {
        double max = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }
}
