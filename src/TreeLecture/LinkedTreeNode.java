package TreeLecture;

public class LinkedTreeNode<E> extends Node<E> {

    private LinkedTreeNode<E> left;
    private LinkedTreeNode<E> right;
    private LinkedTreeNode<E> parent;

    public LinkedTreeNode(E value) {
        super(value);
    }

    public LinkedTreeNode<E> left(){
        return left;
    }

    public LinkedTreeNode<E> right(){
        return right;
    }

    public LinkedTreeNode<E> parent(){
        return parent;
    }
}
