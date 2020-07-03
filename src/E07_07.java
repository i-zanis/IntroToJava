public class E07_07 {
    public static void main(String[] args) {
        int [] counts = new int[10];
        for (int i = 0; i < 200; i++) {
            counts[(int)(Math.random() * 10)]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("The count is " + i + " " +  counts[i]);
        }
    }
}
