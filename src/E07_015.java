public class E07_015 {
    public static void main(String[] args) {
        int[] list = {1, 1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] newList = eliminateDuplicates(list);
        for (int i = 0; i<list.length; i++) {
            System.out.println(newList[i]);
        }
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != list[j]){
                    temp[i] = list[i];
                }

            }
        }
      return temp;
    }
}
