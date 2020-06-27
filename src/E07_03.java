import java.util.Scanner;

public class E07_03 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] counts = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = (int)(Math.random() * 5);
            System.out.print(array[i] + " ");
            System.out.print(((i + 1) %3 ==0) ? "\n" : "");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                if (i == array[j])
                counts[i]++;
                }


        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (counts[i] == 1) {System.out.println(i + " appears " + counts[i] + " time.");
            }
            else {
                System.out.println(i + " appears " + counts[i] + " times.");
            }
        }
    }
}
