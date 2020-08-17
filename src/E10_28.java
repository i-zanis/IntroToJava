public class E10_28 {

    public static void main(String[] args) {

        MyStringBuilder2 s = new MyStringBuilder2("ButtonDemo");
        System.out.println(s.toString());
        System.out.println(s.append(100).toString());
        System.out.println(s.toString());
        System.out.println("lowercase = " + s.toLowerCase());
        System.out.println("substring 0 3: " + s.substring(0, 3));

    }
}
class MyStringBuilder2 {

    private char[] buffer;
    public MyStringBuilder2(char[] chars) {
        buffer = new char[chars.length];

        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public MyStringBuilder2(String s) {
        this(s.toCharArray());
    }

    public MyStringBuilder2 append(int i) {

        String temp = "";
        while (i > 0) {
            temp = i % 10 + temp;
            i /= 10;
        }
        return new MyStringBuilder2(toString() + temp);
    }

    public MyStringBuilder2 append(MyStringBuilder2 s) {

        return new MyStringBuilder2(toString() + s.toString());
    }

    public String toString() {
        return new String(buffer);
    }

    public int length() {
        return buffer.length;
    }

    public char charAt(int i) {
        return buffer[i];
    }

    public MyStringBuilder2 toLowerCase() {
        char[] lower = new char[buffer.length];

        for (int i = 0; i < buffer.length; i++) {
            char old = buffer[i];
            if (old >= 'A' && old <= 'Z') {
                lower[i] = (char) (old - 'A' + 'a');
            } else {
                lower[i] = old;
            }
        }
        return new MyStringBuilder2(lower);
    }

    public MyStringBuilder2 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
            temp[i - begin] = buffer[i];
        }
        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] temp = new char[s.length() + buffer.length];
        for (int i = 0; i < offset; i++) {
            temp[i] = buffer[i];
        }

        for (int i = 0; i < s.length(); i++) {
            temp[offset + i] = s.charAt(i);

        }
        for (int i = offset + s.length(); i < temp.length; i++) {
            temp[i] = buffer[offset++];
        }

        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 reverse() {
        char[] reverse = new char[buffer.length];

        int start = 0;
        for (int i = buffer.length - 1; i >= 0; i--) {
            reverse[i] = buffer[start++];
        }
        return new MyStringBuilder2(reverse);
    }

    public MyStringBuilder2 substring(int begin) {
        return substring(begin, buffer.length);
    }

    public MyStringBuilder2 toUpperCase() {

        char[] temp = new char[buffer.length];

        for (int i = 0; i < buffer.length; i++) {
            char ch = buffer[i];
            if (ch >= 'a' && ch <= 'z') {
                temp[i] = (char) (ch - 'a' + 'A');
            } else {
                temp[i] = ch;
            }
        }
        return new MyStringBuilder2(temp);
    }



}