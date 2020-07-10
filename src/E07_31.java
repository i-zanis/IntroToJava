public class E07_31 {
    public static void main(String[] args) {
        int[] l1 = {1,2,67,64,21,11};
        int[] l2 = {2,4,7,88,0,1,2};
        for (int i = 0; i < l1.length; i++) {
            System.out.print(l1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < l2.length; i++) {
            System.out.print(l2[i] + " ");
        }
        System.out.println();
        merge(l1,l2);


    }
    public static int[] selection(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("initial " + temp + " " + array[i]);
                if (array[j] > array[i]) {
                    System.out.println("first " + temp + " " + array[i]);
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    System.out.println("second " + temp + " " + array[i]);
                }
            }
        }
        return array;
    }
    public static int[] merge(int[] list1, int[] list2) {
       int[] list3 = new int[list1.length + list2.length];
       for (int i = 0; i <list1.length; i++){
           list3[i] = list1[i];
       }
       for (int i = 0; i <list2.length;i++) {
           list3[list1.length + i] = list2[i];
       }
       selection(list3);
       for (int i = 0; i < list3.length; i++) {
           System.out.print(list3[i] + " ");
       }
       return list3;
    }
}
