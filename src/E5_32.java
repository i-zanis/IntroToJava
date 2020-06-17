public class E5_32 {
    public static void main(String[] args) {
    String first = "" + (int)(Math.random() * 10);
    String second = "";
    do  { second = ""+ (int)(Math.random() * 10);
    }
        while (first.equals(second));

        System.out.println(first);
        System.out.println(second);

    String concatN = first + second;
        System.out.println(concatN);

    }
}
