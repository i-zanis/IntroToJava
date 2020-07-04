import java.util.Scanner;

public class E07_015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("The distinct numbers are:");

        numbers = eliminateDuplicates(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {

        int[] newArray = new int[0];
        boolean flag = true;

        newArray = add2Array(newArray, list[0]);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < newArray.length; j++) {

                if (list[i] == newArray[j]) {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                newArray = add2Array(newArray, list[i]);
            }

            flag= true;

        }

        return newArray;

    }

    // Copy array numbers1 to array numbers2
    // If the length of array numbers2 is less then array numbers2, return false
    public static boolean copyArray(int[] source, int[] dest) {
        if (source.length > dest.length)
            return false;

        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        return true;
    }

    // Increase array size by one and add integer to the end of array
    // Return new array
    public static int[] add2Array(int[] source, int data) {

        int[] dest = new int[source.length + 1];
        copyArray(source, dest);
        dest[source.length] = data;
        return dest;

    }

}
