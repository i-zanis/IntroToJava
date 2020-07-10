public class E07_30 {
    public static void main(String[] args) {
        int[] list1 = { 1,2,3,4,4,4,4,5};
        int[] list2 = {1,3,2,3,4,5};
        int[] list3 = { 1,2,3,4,5,6,6,6,6};

        System.out.println("The list is " + isConsecutiveFour(list1));
        System.out.println("The list is " + isConsecutiveFour(list2));
        System.out.println("The list is " + isConsecutiveFour(list3));
    }
    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i +3]) {
                return true;
            }
        }
        return false;
    }
}
