import java.util.Scanner;

public class E07_03 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int[] counts = new int[50];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            array[i] = (int)(1 + Math.random() * 50);
            System.out.print(array[i] + " ");
            System.out.print(((i + 1) %10==0) ? "\n" : "");
        }
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (array[i] == array[j]) {
                    counts[i]++;
                }
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(array[i] + " appears " + counts[i] + " times.");
        }
    }
}
