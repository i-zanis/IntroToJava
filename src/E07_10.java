public class E07_10 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        double[] testray = new double[10];
        for (int i = 0; i < 10; i++) {
            testray[i] = Math.random() * 100;
            System.out.println(testray[i]);
        }
        System.out.println(indexOflargestElement(testray));
    }
    public static int indexOflargestElement(double[] array) {
        double max = 0.0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
