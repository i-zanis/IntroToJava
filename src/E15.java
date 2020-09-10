public boolean delete(E e) {
        155 // Locate the node to be deleted and also locate its parent node
        156 TreeNode<E> parent = null;
        157 TreeNode<E> current = root;
        158 while (current != null) {
        159 if (e.compareTo(current.element) < 0) {
        160 parent = current;
        161 current = current.left;
        162 }
        163 else if (e.compareTo(current.element) > 0) {
        164 parent = current;
        165 current = current.right;
        166 }
        167 else
        168 break; // Element is in the tree pointed at by current
        169 }