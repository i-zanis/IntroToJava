public class E5_46 {
    public static void main(String[] args) {
        String str = "animal";
        String rStr = "";
        for (int i = 0; i < str.length();i++) {
            rStr = str.charAt(i) + rStr;
            System.out.println(rStr);
        }
        System.out.println("final is " + rStr);

    }
}
