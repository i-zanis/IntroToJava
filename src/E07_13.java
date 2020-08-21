public class E07_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,2,3,15,8));
    }
    public static int getRandom(int ... numbers) {
        int[] list = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            list[i] = numbers[i];


        }
        return list[(int)(Math.random() * numbers.length)];
        }
    }

