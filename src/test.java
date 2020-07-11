import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class test {

    public static void main(String[] args) {
        int[] test = {9, 2, 7, 8, 4, 1, 6, 3, 5};

        for (int item: test) {
            System.out.print(item +" ");
        }
        System.out.println();
        sort(test);
        for (int item: test) {
            System.out.print(item +" ");
        }
    }
    /**public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i <N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if ((a[min] < (a[j]))) {
                    min = j;
                }
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
     */
   public static boolean less(Comparable v, Comparable w) {
       return v.compareTo(w) < 0;
   }

/* public static boolean less(int small, int big) {
        if ((small < big)) {
            return true;
        }
        return false;
    }*/
        public static void exch( int[] a, int i, int j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i <N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j],a[min])) { min = j;}
            }
            exch(a,i,min);
        }
    }




}

