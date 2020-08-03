public class E10_05 {
    public static void main(String[] args) {
    int N = 250;
    StackOfIntegers test = new StackOfIntegers();
        for (int i = 1; i < N; i++) {
        if (N % i == 0) {
            test.push(N/i);
            N = N/i;
        }
    }
        for (int i = test.getSize(); i > 0; i--) {
            System.out.println(test.elements[i]);
        }
    }
}
class StackOfIntegers {
    int[] elements; //just for testin made non-private
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    StackOfIntegers() {
        elements = new int[DEFAULT_CAPACITY];
    }

    StackOfIntegers(int new_capacity) {
        elements = new int[new_capacity];
    }

    public int push(int number) {
        if (size > elements.length) {
            int[] temp = new int[elements.length + 1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        return elements[size++] = number;
    }

    public int pop(int number) {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }


}
