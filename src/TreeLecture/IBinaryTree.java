package TreeLecture;

public interface IBinaryTree<E> extends ITree<E> {

    Node<E> left(Node<E> p);
    Node<E> right(Node<E> p);
    Node<E> sibling(Node<E> p);

    Node<E> addRoot(E e);
    Node<E> addLeft(Node<E> p, E e);
    Node<E> addRight(Node<E> p, E e);
    void attach(Node<E> p, IBinaryTree<E> T, IBinaryTree<E> U );

    Node<E> remove(Node<E> p);

}
