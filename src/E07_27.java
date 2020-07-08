public class E07_27 {

        public static void main(String[] args) {
            int[] yoList = {1, 2, 3, 4, 5};
            int[] yerList = {10, 15, 20, 25};

            if (isSortedConstantInterval(yoList)) {
                System.out.println("The list is sorted with an interval.");
            } else {
                System.out.println("The list is not sorted with an interval.");
            }

            if (isSortedConstantInterval(yerList)) {
                System.out.println("The list is sorted with an interval.");
            } else {
                System.out.println("The list is not sorted with an interval.");
            }
        }

        public static boolean isSortedConstantInterval(int[] list){
            for (int i = 0; i < list.length -1 ; i++) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
                else if (list[i + 1] - list[i] == list[i + 2] - list[i + 1])
                    return true;
            }
            return true;
        }




}
