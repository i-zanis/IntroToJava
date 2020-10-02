import java.util.Arrays;

public class E13_08 {
    public static void main(String[] args) {
    }
    public class MyStack {
        Object[] elements;
        int size;
        
        public Object pop() {
            return elements[--size];
        }
        public Object peek() {
            return elements[size];
        }
        public void push(Object o) {
            if (size > elements.length) {
                Object[] temp = new Object[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }
            elements[size++] = o;
        }

        public int getSize() {
            return size;
        }
        public Boolean isEmpty() {
            return size == 0;
        }
    }
}
/**Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
 a deep copy of the list field8 */
