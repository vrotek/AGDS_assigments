package AS05.TreeLib;



import java.util.Iterator;

public interface ITree<E> extends Iterable<E> {

    Node<E> root();

    Node<E> parent(Node<E> p);

    Iterable<Node<E>> children(Node<E> p);

    int numChildren(Node<E> p);

    //Query Methods

    boolean isInteral(Node<E> p);
    boolean isExternal(Node<E> p);
    boolean isRoot(Node<E> p);

    //General Collection Methods

    int size();
    boolean isEmpty();
    Iterator<E> iterator();
    Iterable<Node<E>> positions();

}
