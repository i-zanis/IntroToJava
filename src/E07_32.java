public class E07_32 {
    public static void main(String[] args) {
        int[] list1 = { 1,12,9,4,4,4,4,5};
        int[] list2 = {1,3,2,3,4,5};
        int[] list3 = { 1,2,3,4,5,6,6,6,6};
        sort(list1, list1[0], list1[list1.length-1]);
        for (int i =0; i< list1.length; i++) {
            System.out.println(list1[i]);
        }
    }
    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];
        while (true) {
            while ((a[++i] < v)) {
                if (i == hi) {
                    break;
                }
            }

            while (v < a[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >=j) { break; }
            int temp = i;
            i = j;
            j = temp;


        }
            int temp = lo;
            lo = j;
            j = temp;
            return j;


    }

}
