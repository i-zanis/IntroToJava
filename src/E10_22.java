public class E10_22 {
    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[]{'A', 'B', 'C'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.equals(new MyString1(new char[]{'a', 'b', 'c'})));
        s = s.toLowerCase();
        System.out.println(s.charAt(1));

    }

}
class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] temp = new char[end];
        System.arraycopy(chars, begin, temp, 0, end);
        return new MyString1(temp);
    }

    public MyString1 toLowerCase() {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 || chars[i] <= 90) {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new MyString1(chars);
    }

    public static MyString1 valueOf(int i) {
        char[] temp = new char[40];
        int size = 0;
        while (i != 0) {
            int number = i % 10;
            i = i / 10;
            temp[size] = (char) (number + '0');
            size++;
        }

        char[] temp2 = new char[size];
        for (int k = size - 1; k >= 0; k--) {
            temp2[k] = temp[size - k - 1];
        }
        return new MyString1(temp2);
    }
    public boolean equals(MyString1 s) {
        return this == s;
    }
}


