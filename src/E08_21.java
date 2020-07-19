public class E08_21 {
    public static void main(String[] args) {
        double[][] matrix = {
                {2.5, 5.0},
                {5.1, 3.0},
                {1.0, 9.0},
                {5.4, 54},
                {5.5, 2.1}};
        double[][] info = new double[5][5];
        findCity(matrix,info);



                for (int i = 0; i < info.length; i++) {
                    int min = i;
                    for (int j = i + 1; j <info.length; j++) {
                        if (info[j][0] < info[min][0]) min = j;
                    }
                    double temp = info[min][0];
                    info[min][0] = info[i][0];
                    info[i][0] = temp;

                }
                for (int i = 0; i < info.length; i++) {
                    for (int j =0; j< info[0].length; j++) {
                        System.out.printf("%5.2f %1s", info[i][j]," ");
                    }
                    System.out.println();
                }
 }

    public static double distance(double[][] m, double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }
    public static void findCity(double[][] m, double[][] info) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 4; j++) {
                double x1 = m[i][0];
                double y1 = m[i][1];
                double x2 = m[j][0];
                double y2 = m[j][1];
                info[i][j] = distance(m, x1, y1, x2, y2);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                info[i][4] += info[i][j];
            }
    }
}
}
