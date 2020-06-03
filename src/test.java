public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("first");
            for (int j = 0; j < i; j++)
                System.out.println(i * j);
        }
    }
}

.class 