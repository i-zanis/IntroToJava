public class E07_12 {
    public static void main(String[] args) {
        int[] array = { 0,1,2,3,4,5,6,7,8,9};
        array = reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static int[] reverse(int a[]) {
        int hi = a.length;
        int [] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[hi - i - 1];
        }
        return temp;
    }
}
