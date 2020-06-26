public class E06_38 {
    public static void main(String[] args) {
        for(int i = 1; i <200; i++) {
            System.out.print((i % 10 == 0) ? getRandomCharacter() +"\n" : getRandomCharacter());
        }
        for(int i = 1; i <200; i++) {
            System.out.print((i % 10 == 0) ? getRandomCharacter('1','9') +"\n" : getRandomCharacter('1','9'));
        }
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');

    }

}
