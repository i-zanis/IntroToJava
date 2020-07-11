public class E08_03 {
    public static void main(String[] args) {
        boolean[][] students =
                {{false, true, true, false},
                        {true,true,true,true},
                        {false, false, false, false},
                        {true,false,false,false}};
        int[] count = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[0].length; j++) {
                if (students[i][j] == true) count[i]++;
            }
        }
        for (int i = 0; i < students.length; i++) {
            int temp = 0;
            for (int j = 0; j < students.length; j++) {
                if (count[i] > count[j]) {
                    temp = count[i];
                    count[i] = count[j];
                    count[j] = temp;
           

                }
            }
        }
    for (int i = 0; i < students.length; i++) {
        System.out.println(count[i]);
    }
    }
}
