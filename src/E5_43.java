public class E5_43 {
    public static void main(String[] args) {
        int count = 0;
        String s = "";

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (j != i && !s.contains(j + " " + i)) {
                    count++;
                    s = s + "\n" + i + " " + j;
                }

            }

        }
        System.out.println(s);

        System.out.println("The total number of all combinations is " + count);

    }
}