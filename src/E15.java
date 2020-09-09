public boolean insert(E e) {
    if (root == null) root = createNewNode(e); // Create a new root
    else {
         TreeNode<E> parent = null;
         TreeNode<E> current = root;
         while (current != null)
         if (e.compareTo(current.element) < ) {
         parent = current;
         current = current.left;
         }
         else if (e.compareTo(current.element) > ) {
         parent = current;
         current = current.right;}

         else
         return false; // Duplicate node not inserted

         // Create the new node and attach it to the parent node
         if (e.compareTo(parent.element) < )
         parent.left = createNewNode(e);
         else
         parent.right = createNewNode(e);
         }

         size++;
         return true; // Element inserted successfully
         }