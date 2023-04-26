package AS05.TreeLib;



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

    public void setLeft(LinkedTreeNode<E> left) {
        this.left = left;
    }

    public LinkedTreeNode<E> right(){
        return right;
    }

    public void setRight(LinkedTreeNode<E> right) {
        this.right = right;
    }

    public LinkedTreeNode<E> parent(){
        return parent;
    }

    public void setParent(LinkedTreeNode<E> parent) {
        this.parent = parent;
    }
}
