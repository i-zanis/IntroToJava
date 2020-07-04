public class E07_22 {
    public static void main(String[] args) {
        String s = "yo Umama lallae";
        s = s.toLowerCase();
        System.out.println(countV(s));
    }

    public static int countV(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == 'a') || (a.charAt(i) == 'e') ||
                    (a.charAt(i) == 'i') || (a.charAt(i) == 'o') || (a.charAt(i) == 'u')) {
                count++;
            }

        }
        return count;
    }
}

