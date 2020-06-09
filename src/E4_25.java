public class E4_25 {
    public static void main(String[] args) {

        char plateLetters1 = (char)('A' + Math.random() * 26);
        char plateLetters2 = (char)('A' + Math.random() * 26);
        char plateLetters3 = (char)('A' + Math.random() * 26);


        int digit = (int)(1000 + Math.random() * (9999-1000));


        System.out.println("The code you have requested is: \n" + plateLetters1 + "" +  plateLetters2 +  "" + plateLetters3 + digit);
    }
}
