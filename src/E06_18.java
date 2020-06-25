public class E06_18 {
    public static void main(String[] args) {
        System.out.println(check("f111111a11"));
        System.out.println(check("012345steq10"));
        System.out.println(check("0rfsfsfsteq10"));
        System.out.println(check("abc1456851"));
    }

    public static boolean check(String password) {
        int count = 0;
        if (password.length() == 10) {
;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetterOrDigit(password.charAt(i))) {

                    if (Character.isDigit(password.charAt(i))) {
                        count++;
                        if (count >= 3) {
                            return true;
                        }
                    }
                }
            }




        }
        return false;
    }
}



