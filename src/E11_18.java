import java.util.ArrayList;

public class E11_18 {
    public static void main(String[] args) {
    String test = "yahoo";
    ArrayList<Character> s =  new ArrayList<>();
    s = toCharacterArray(test);
    for (Character e : s) {
        System.out.println(e);
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
