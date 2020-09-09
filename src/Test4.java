public class Test4 {
    public static void main(String[] args) {
        public E removeFirst() {
            if (size == 0) return null; // Nothing to delete
            else {
                Node<E> temp = head; // Keep the first node temporarily
                head = head.next; // Move head to point to next node
                size--; // Reduce size by 1
                if (head == null) tail = null; // List becomes empty
                return temp.element; // Return the deleted element
            }
    }

}




