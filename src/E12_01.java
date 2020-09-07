import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class E12_01 {
    public static void main(String[] args) {
String allInOne = "";
for (String arg : args) {
    allInOne += arg;
}
String[] tokens = allInOne.split(allInOne, "[+-*/]");
    }

    private static String[] worldSplit(String s, String regex) {
        ArrayList<String> temp = new ArrayList<>();
        int newIndex = 0;
        for (int i = 0; i< s.length() - regex.length(); i++) {
            if (regex.compareTo(s.substring(i, i + regex.length())) == 0)
        temp.add(s.substring(newIndex,i));
        temp.add(regex);
        newIndex = i + regex.length();
        }
        temp.add(s.substring(newIndex, s.length()));
        return temp.toArray(new String[temp.size()];
    }
    private static String[] arraySplit(String s, String regex) {
    char[] regexChars = getRegex(regex);
        ArrayList<String> temp = new ArrayList<>();
        int newIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < regexChars.length; j++) {

                if (ch == regexChars[j]) {
                    if (newIndex != i)
                        temp.add(s.substring(newIndex, i));
                    temp.add("" + regexchars[j]);
                    newIndex = i + 1;
                }
            }
        }
        temp.add(s.substring(newIndex, s.length(()));
        return temp.toArray(new String[temp.size()]);
    }
    private static char[] getRegex(String regex) {
        if (regex.charAt(0) != '[' && regex.charAt(regex.length()-1) != ']')
            return regex.toCharArray();
        else
            return regex.substring(1, regex.length() -1).toCharArray();
        }
        private static boolean isRegexArray(String regex) {
        return (regex.charAt(0) == '[' && regex.charAt((regex.length() - 1 == ']');
    }
}