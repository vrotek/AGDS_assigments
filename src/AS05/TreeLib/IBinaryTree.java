package AS05.TreeLib;



public interface IBinaryTree<E> extends ITree<E> {

        LinkedTreeNode<E> left(LinkedTreeNode<E> p);

        LinkedTreeNode<E> right(LinkedTreeNode<E> p);

        LinkedTreeNode<E> sibling(LinkedTreeNode<E> p);


        LinkedTreeNode<E> addRoot(E e);
        LinkedTreeNode<E> addRoot(LinkedTreeNode<E> e);
        LinkedTreeNode<E> addLeft(LinkedTreeNode<E> p, E e);
        LinkedTreeNode<E> addRight(LinkedTreeNode<E> p, E e);
        void attach(LinkedTreeNode<E> p, IBinaryTree<E> T, IBinaryTree<E> U );

        LinkedTreeNode<E> remove(LinkedTreeNode<E> p);


        Node<E> parent(Node<E> p);

        Iterable<Node<E>> children(Node<E> p);

        int numChildren(Node<E> p);

        boolean isInteral(Node<E> p);

        boolean isExternal(Node<E> p);

        boolean isRoot(Node<E> p);
}
