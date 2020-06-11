public class E5_11 {
    public static void main(String[] args) {
        int itemCount = 0;
        for(int i=100; i<=200; i++){
            if(i%3 == 0 ^ i%4 == 0){
                System.out.print(i + " ");
                itemCount +=1;

                //print new line character after item 10th and reset the item count
                if(itemCount==10){
                    System.out.println("\n");
                    itemCount = 0;
                }
            }
        }



    }

}