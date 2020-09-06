import java.util.ArrayList;

public class E11_18 {
    public static void main(String[] args) {
        for (Character c : toCharacterArray("Welcome")) {
            System.out.print(c);
        }
    }
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}