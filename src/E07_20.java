public class E07_20 {
    public static void main(String[] args) {
        String[] students = {"Max", "Carla", "Thalia", "Thomas", "Kinga"};
        int[] grades = {50, 44, 11, 90, 1};
        for (int i = 0; i < grades.length; i++)
            System.out.println("The students are " + students[i] + " " + grades[i] + " ");
        System.out.println();
        sort(grades, students);
        for (int i = 0; i < grades.length; i++)
            System.out.println("The students are " + students[i] + " " + grades[i] + " ");

    }
    public static int[] sort(int a[], String x []) {
        int temp = 0;
        String tempS = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    tempS = x[i];
                    x[i] = x[j];
                    x[j] = tempS;
                }
            }
        }


        return a;
    }
}



