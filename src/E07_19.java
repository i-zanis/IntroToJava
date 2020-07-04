public class E07_19 {
    public static void main(String[] args) {
        int[] grades = {50, 44, 11, 90, 1};
        int[] grades2 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(grades2));
        System.out.println(isSorted(grades));
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i <list.length - 1; i++) {
            if (list[i] > list [i + 1]) {
                return false;
            }
        }
        return true;
    }
}
