public class test {

    public static void main(String[] args) {
        long sum = 0;
        long sum1 = 0;
        double startTime = System.nanoTime();
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        double endTime = System.nanoTime();
        System.out.println(("Time " + (endTime - startTime)/100000000));
        System.out.println(sum);

        startTime = System.nanoTime();
        sum1 = (10000*(10000+1))/2;
        endTime = System.nanoTime();
        System.out.println(("Time " + (double)(endTime - startTime)/100000000));
        System.out.println(sum1);



    }
}