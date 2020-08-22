public class E5_51 {
    public static void main(String[] args) {
        String first = "Welcome to C++";
        String second = "Welcome to programming";
        String check = "";
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                check = check + first.charAt(i);
            }
        }

        System.out.println("The common prefix is: " + check);
    }
}
