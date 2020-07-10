public class E07_28 {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";

        for (int i = 0; i < 10000; i++) {
            if (Integer.toString(i).contains("1") && Integer.toString(i).contains("2") && Integer.toString(i).contains("3") && Integer.toString(i).contains("4")) {
                System.out.println(i);
            }

        }
    }
}
