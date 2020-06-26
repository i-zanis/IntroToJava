public class E06_30 {
    public static int main(String[] args) {
        switch (diceRoll() + diceRoll()) {
            case 2:
            case 3:
            case 12:
                System.out.println("You lose");
                break;
            case 7:
            case 11:
                System.out.println("Natural, you win!");
                break;
            case 4:
                System.out.println("re-roll");
                if (diceRoll() + diceRoll() == 4) {
                    System.out.println("You win!.");
                }
                if (diceRoll() + diceRoll() == 7) {
                    System.out.println("You lose.");
                } else {
                }

        }
        public static int diceRoll() {
            return (1 + (int) Math.random() * 6);
        }
    }
}
