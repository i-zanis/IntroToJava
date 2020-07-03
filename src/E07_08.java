public class E07_08 {
    public static void main(String[] args) {
    int [] intray = new int[10];
    double [] doubleray = new double[10];
    for (int i = 0; i < 10; i ++) {
        intray[i] = (int)(Math.random() * 10);
        System.out.print(intray[i] + " ");
    }
        for (int i = 0; i < 10; i ++) {
            doubleray[i] = (Math.random() * 10);
            System.out.print(doubleray[i] + " ");
        }


            System.out.println("\n" + average(intray) + " " + average(doubleray));;

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
