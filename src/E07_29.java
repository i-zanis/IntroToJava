public class E07_29 {
    public static void main(String[] args) {
        String[] list = new String[1000];
        for (int i = 0, j = 3; i < 1000; i++) {
            int a = diceRoll();
            int b = diceRoll();
            int c = diceRoll();
            if (a + b + c == 9) {
                list[i] = " " + a + " " + b + " " + c;


            }
        }
        }
        public static int diceRoll () {
            return (int) (1 + Math.random() * 6);
        }

}


