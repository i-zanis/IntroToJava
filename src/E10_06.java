public class E10_06 {
    public static void main(String[] args) {
        StackOf_Integers test1 = new StackOf_Integers(15);
        int count = 120;
        while (count != 0) {
            if (isPrime(count)) {
                test1.push(count);
            }
            count--;
        }
        while (!test1.isEmpty()) {
            System.out.println(test1.pop() + " ");
        }
    }
    public static boolean isPrime(int prime) {
        if (prime < 2) return false;
        for (int i = 2; i * i <= prime; i++) {
            if(prime % i == 0) return false;
        }
        return true;
    }
}
class StackOf_Integers {
    private int[] elements;
    private int size;

    StackOf_Integers() {
    }

    StackOf_Integers(int new_capacity) {
        elements = new int[new_capacity];
    }
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }
    public int peek() {
        return elements[size - 1];
    }
    public int pop() {
        return elements[--size];
    }
    public boolean isEmpty() {
        return size ==0;
    }

    public int getSize() {
        return size;
    }


}
