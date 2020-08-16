import java.util.Arrays;

public class E10_26 {
    public static void main(String[] args) {
        String x = remove("f           f");
        System.out.println(x);
    }

    public static String remove(String s) {
        char[] a = s.toCharArray();
        char[] temp = new char[s.length()];
        int counts = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != ' ') {
                temp[counts] = a[i];
                counts++;
            }
        }
        char[] b = new char[counts];
        for (int i = 0; i < counts; i++) {
            b[i] = temp[i];
        }
        return s.valueOf(b);
    }
}

