public class E07_21 {
    public static void main(String[] args) {
                String[] students = {"Max", "Carla", "Thalia", "Thomas", "Kinga"};
                double[] grades = {50, 44, 11, 90, 1};
                grades = normalize(grades);
                for (int i = 0; i < grades.length; i++)
                    System.out.println("The students are " + students[i] + " " + grades[i] + " ");
                System.out.println();
                sort(grades, students);
                for (int i = 0; i < grades.length; i++)
                    System.out.println("The students are " + students[i] + " " + grades[i] + " ");
                grades = normalize(grades);
        System.out.println();
                for (int i = 0; i < grades.length; i++)
            System.out.println("The students are " + students[i] + " " + grades[i] + " ");
            }
            public static double[] sort(double a[], String x []) {
                double temp = 0;
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
            public static double[] normalize(double[] a) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = (a[i] - a[0]) / (a[a.length - 1] - a[0]);

                }
                return a;
            }

        }







