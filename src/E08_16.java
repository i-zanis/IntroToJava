public class E08_16 {
    public static void main(String[] args) {
        int m[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

        sort(m);

        printArray(m);
    }

    public static void sort(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            double curMin = m[i][0];
            int curMinIndex = i;
            for (int j = i; j < m.length; j++) {
                if (curMin > m[j][0]
                        || (curMin == m[j][0] && m[curMinIndex][1] > m[j][1])) {
                    curMin = m[j][0];
                    curMinIndex = j;
                }
            }

            // Swap list[i] with list[curMinIndex] if necessary;
            if (curMinIndex != i) {
                int temp0 = m[curMinIndex][0];
                int temp1 = m[curMinIndex][1];
                m[curMinIndex][0] = m[i][0];
                m[curMinIndex][1] = m[i][1];
                m[i][0] = temp0;
                m[i][1] = temp1;
            }
        }
    }

    public static void printArray(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][0] + ", " + m[i][1]);
        }
    }

}
