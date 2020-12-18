public class TestSelection {
    public static void main(String[] args) {
    int[] yo = {9,7,8,6,4,5,2,3,1,0};

    for (int i = 0; i < yo.length; i++) {
        System.out.print(yo[i] + " ");
    }
    sort(yo);
        System.out.println();
        for (int i = 0; i < yo.length; i++) {
            System.out.print(yo[i] + " ");
        }
    }
    public static void sort(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)  {
                if (array[j] < array[min]) min = j;
            }
            exchange(array, i, min);

        }
    }

    /**
     * Exchange variables method for the Int[] arrays
     * @param array Int[] array
     * @param i index
     * @param j index
     */
    static void exchange(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * Overloaded Exchange method for Candidate[] arrays
     * @param array Candidate[] array
     * @param i index
     * @param j index

    static void exchange(Candidate[] array, int i, int j) {
        Candidate t = array[i];
        array[i] = array[j];
        array[j] = t;
     */
    }

