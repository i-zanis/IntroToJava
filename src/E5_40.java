public class E5_40 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int i = 0;
        while (i < 1_000_000) {
            int j = (int)(Math.random() * 2);
            if (j == 0) {
                heads++;
            } else {
                tails++;
            }
            i++;

        }
        System.out.println("The heads are " + heads + ".\n" + "The tails are " + tails + ".");
    }
}
