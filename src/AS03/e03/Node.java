package AS03.e03;

// Simple generic Node Class

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T data, Node<T> next, Node<T> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
