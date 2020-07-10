public class test {

    public static void main(String[] args) {
       double start = System.nanoTime();
       abs(5000);
       double end = System.nanoTime();
       System.out.println(("manual " + (end-start)));

        start = System.nanoTime();
        Math.abs(5000);
        end = System.nanoTime();
        System.out.println("standard " + (end-start));

        start = System.nanoTime();
        abs(5000);
        end = System.nanoTime();
        System.out.println(("manual " + (end-start)));

        start = System.nanoTime();
        Math.abs(5000);
        end = System.nanoTime();
        System.out.println("standard " + (end-start));



    }
    public static double abs(double x)
    {
        if (x < 0.0) return -x;
        else return x;
    }
}