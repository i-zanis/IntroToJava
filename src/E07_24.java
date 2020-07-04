public class E07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int tries = 0;
        int atleast1 = 52;

        for (int i = 0; i < 52; i++) {
            deck[(int)((Math.random() * 52))]++;
            tries++;
            for (int j = 0; j < 52; j++) {
                if (deck[j] == 0) {
                    i = 0;
                    break;
                }
            }
        }
        for (int j = 0; j < 52; j++) {
            System.out.println(j+1 + " = " + deck[j]);
        }
        System.out.println(tries);
    }
}
