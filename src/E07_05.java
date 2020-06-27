public class E07_05 {
    public static void main(String[] args) {
        int[] list = new int[10];
        int oddcount = 0;
        int evencount = 0;
        for (int i = 0; i < 10; i++) {
            list[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < 10; i++) {
            if (list[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;

            }

        }
        for (int i = 0; i < 10; i++) {
            if (i % 3 ==0) {
                System.out.println();
            }
        System.out.print(list[i] + " ");}
        System.out.println("The odd numbers are " + oddcount);
        System.out.println("The even numbers are " + evencount);
    }
}
