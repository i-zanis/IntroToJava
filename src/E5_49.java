public class E5_49 {
    public static void main(String[] args) {
        String sample = "PROGRAMMING IS FUN";

        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == 'A' || sample.charAt(i) == 'E' || sample.charAt(i) == 'I' || sample.charAt(i) ==  'O' || sample.charAt(i) ==  'U'){
                System.out.println("The string char at index " + i + " is a vowel.");
            }
        }

    }

}
