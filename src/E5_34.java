public class E5_34 {
    public static void main(String[] args) {
        int computer = 0;
        int human = 0;
        while ((human - computer !=3) && (computer - human != 3)) {
            int tryC = (int) (Math.random() * 3);
            int tryH = (int) (Math.random() * 3);
            if ((tryC == 0 && tryH == 2) || (tryC == 1 && tryH == 0) || (tryC == 2 && tryH == 1)) {
                    computer++;
                    System.out.println("The computer won this round");
                    System.out.println("Score: " + computer + " vs " + human + "\n");
            }
            if ((tryH == 0 && tryC == 2) || (tryH == 1 && tryC == 0) || (tryH == 2 && tryC == 1)) {
                human++;
                System.out.println("The human won this round");
                System.out.println("Score: " + computer + " vs " + human + "\n");
            }
        }
    }
}
