public class E07_11 {
    public static void main(String[] args) {
        double[] testray = { 1,2,3,4,5,6,7,8,9};


        System.out.println("The mean is " + mean(testray));
        System.out.println("The deviation is " +  deviation(testray));

        }
    public static double deviation ( double[] x){
        double sum = 0.0;
        double mean = mean(x);
        double deviation;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i]-mean), 2);
        }
        return deviation = Math.sqrt(sum/(x.length - 1));

    }
    public static double mean(double[] x) {
        double sum = 0.0;
        for (int i = 0;i < x.length; i ++) {
            sum += x[i];
        }
        return sum/x.length;
    }

}
