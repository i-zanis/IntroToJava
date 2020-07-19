public class display {
    public display(Comparable[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
