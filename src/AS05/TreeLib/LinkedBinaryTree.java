package AS05.TreeLib;




import java.util.Iterator;

public class LinkedBinaryTree<E> implements IBinaryTree<E> {

    private LinkedTreeNode<E> root;


    @Override
    public LinkedTreeNode<E> left(LinkedTreeNode<E> p) {
        return p.left();
    }

    @Override
    public LinkedTreeNode<E> right(LinkedTreeNode<E> p) {
        return p.right();
    }

    @Override
    public LinkedTreeNode<E> sibling(LinkedTreeNode<E> p) {
        if(p == p.parent().left()){
            return p.right();
        }else {
            return p.left();
        }
    }

    @Override
    public LinkedTreeNode<E> addRoot(E e) {
        LinkedTreeNode<E> root = new LinkedTreeNode<>(e);
        this.root = root;
        return root;
    }

    @Override
    public LinkedTreeNode<E> addRoot(LinkedTreeNode<E> e) {
        this.root = e;
        return e;
    }

    @Override
    public LinkedTreeNode<E> remove(LinkedTreeNode<E> p) {
        return null;
    }

    @Override
    public LinkedTreeNode<E> addLeft(LinkedTreeNode<E> p, E e) {
        LinkedTreeNode<E> node = new LinkedTreeNode<>(e);
        p.setLeft(node);
        return node;
    }

    @Override
    public LinkedTreeNode<E> addRight(LinkedTreeNode<E> p, E e) {
        LinkedTreeNode<E> node = new LinkedTreeNode<>(e);
        p.setRight(node);
        return node;
    }

    @Override
    public void attach(LinkedTreeNode<E> p, IBinaryTree<E> T, IBinaryTree<E> U) {

    }

    @Override
    public Node<E> root() {
        return this.root;
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
