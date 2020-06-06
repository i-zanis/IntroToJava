public class test {
    public static void main(String[] args) {
        double tuition = 10000;
        double year = 0;
        double interest = 1.07;
        while (year !=5) {
            tuition =  (tuition * interest);
            year++;
            System.out.printf("The tuition for %10.2f is %10.2f tuition\n", year, tuition);
        }
        System.out.println("The tuition is " + tuition);
    }

}
