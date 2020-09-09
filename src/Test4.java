public class Test {
    public static void main(String[] args) {
        public boolean search(E element) {
            TreeNode<E> current = root; // Start from the root
            while (current != null)
                if (element < current.element) {
                    current = current.left; // Go left
                }
                else if (element > current.element) {
                    current = current.right; // Go right
                }
                else // Element matches current.element
                    return true; // Element is found

            return false; // Element is not in the tree
        }
    }

}
    }
}


