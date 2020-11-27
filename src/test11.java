import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) throws Exception {
        System.out.println(duplicateCharacters("tTtttttt"));
        }

    static int duplicateCharacters(String input) {

        ArrayList<Character> first = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            first.add(input.charAt(i));
        }

        ArrayList<Character> second = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            if (!second.contains(first.get(i))) {
                second.add(first.get(i));
            }
        }
        return first.size() - second.size() - 1;
    }
}