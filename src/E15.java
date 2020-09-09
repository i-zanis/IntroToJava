public boolean search(E e) {
         TreeNode<E> current = root; // Start from the root
        
         while (current != null) {
         if (e.compareTo(current.element) < ) {
         current = current.left;
         }
         else if (e.compareTo(current.element) > ) {
         current = current.right;
         }
         else // element matches current.element
         return true; // Element is found
         }
        
         return false;
         }