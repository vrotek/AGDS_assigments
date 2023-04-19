package TreeLecture;

import java.util.Iterator;

public class LinkedBinaryTree<E> implements IBinaryTree<E> {

    @Override
    public Node<E> left(Node<E> p) {
        return null;
    }

    @Override
    public Node<E> right(Node<E> p) {
        return null;
    }

    @Override
    public Node<E> sibling(Node<E> p) {
        return null;
    }

    @Override
    public Node<E> root() {
        return null;
    }

    @Override
    public Node<E> parent(Node<E> p) {
        return null;
    }

    @Override
    public Iterable<Node<E>> children(Node<E> p) {
        return null;
    }

    @Override
    public int numChildren(Node<E> p) {
        return 0;
    }

    @Override
    public boolean isInteral(Node<E> p) {
        return false;
    }

    @Override
    public boolean isExternal(Node<E> p) {
        return false;
    }

    @Override
    public boolean isRoot(Node<E> p) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Node<E>> positions() {
        return null;
    }
}
