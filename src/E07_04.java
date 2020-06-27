public class E07_04 {
    public static void main(String[] args) {
        int []scores = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            scores[i] = (int)(1 + Math.random() * 100);
            sum+= scores[i];
        }
        for (int i = 0; i < 20; i++) {
            if (scores[i] > sum/20) {
                System.out.println("The score " + scores[i] + " is higher than the average " + sum/20 + ".");
            }
            if (scores[i] == sum/20) {
                System.out.println("The score " + scores[i] + " is equal to the average " + sum/20);
            }
        }

    }
}
