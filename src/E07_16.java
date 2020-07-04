public class E07_16 {
    public static void main(String[] args) {
        int[] bigArray = new int[100_000_500];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i;
        }
        int key1 = 1;
        int key2 = 25_000_000;
        int key3 = 50_000_000;
        int key4 = 75_000_000;
        int key5 = 100_000_000;
        long endTime = 0;
        double executionTime = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < bigArray.length; i++) {
            if (bigArray[i] == key1 || bigArray[i] == key2 || bigArray[i] == key3 || bigArray[i] == key4 || bigArray[i] == key5) {
                endTime = System.nanoTime();
                executionTime = endTime - startTime;
                System.out.println("Execution time for " + bigArray[i] + " = " + (executionTime / 100000000.0) + " seconds.");
            }
        }
        startTime = System.nanoTime();
        bSearch(100_000_000, bigArray);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println(executionTime/100000000.0);
    }

    public static int bSearch(int key, int[] a) {
        return bSearch(key, a, 0, a.length - 1);
    }

    public static int bSearch(int key, int[] a, int low, int hi) {
        if (low > hi) return -1;
        int mid = low + (hi - low) / 2;
        if (key < a[mid]) return bSearch(key, a, low, mid - 1);
        else if (key > a[mid]) return bSearch(key, a, mid + 1, hi);
        else return mid;
    }
}