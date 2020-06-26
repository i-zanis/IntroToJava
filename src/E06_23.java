public class E06_23 {
    public static void main(String[] args) {
        System.out.println(count("I am going to school", 'o'));
    }
    public static int count(String sample, char a) {
        int counter = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }
}
