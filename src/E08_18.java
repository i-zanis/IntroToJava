public class E08_18 {
    public static void main(String[] args) {
    int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            shuffle(m);

        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
    }
    public static void shuffle(int[][] m) {

        for (int i = 1; i < m.length; i++) {
            int random = (int)(Math.random() * 5);
            int temp0 = m[i][0];
            int temp1  = m[i][1];
            m[i][0] = m[random][0];
            m[i][1] = m[random][1];
            m[random][0] = temp0;
            m[random][1] = temp1;
        }
    }
}
