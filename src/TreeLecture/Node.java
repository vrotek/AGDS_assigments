package TreeLecture;

public class Node<E> {
    protected E element;

    public Node(E value){
        this.element = value;
    }

    public E getValue(){
        return element;
    }
}
