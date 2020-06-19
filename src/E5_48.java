public class E5_48 {
    public static void main(String[] args) {
        String test = "Beijing Chicago";
        for (int i = 0; i < test.length(); i++) {
            if ((i -1) % 2 == 0 & test.charAt(i) !=' ') {
                System.out.print(test.charAt(i));
            }
        }
    }
}
