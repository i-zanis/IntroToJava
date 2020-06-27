import java.util.Scanner;

public class E07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[11];
        for (int i = 0; i <11; i++) {
            System.out.println("Input number: ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 11; i++) {
            if (array[i] == array[10]) {
                System.out.println(array[i]+ " is equal to " + array[10]);
            }
            if (array[i] > array[10]) {
                System.out.println(array[i]+ " greater than " + array[10]);
            }
            if (array[i] < array[10]) {
                System.out.println(array[i]+ " less than " + array[10]);
            }
        }

    }
}
