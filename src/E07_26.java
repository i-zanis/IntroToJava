public class E07_26 {
    public static void main(String[] args) {
        int[] yoList = {1, 2, 3, 4, 5};
        int[] yerList = {2, 1, 5, 6, 7};

        if (isSorted(yoList)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        if (isSorted(yerList)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }
    
        public static boolean isSorted(int[] list){
            for (int i = 0; i < list.length -1 ; i++) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
            }
            return true;
        }

}
