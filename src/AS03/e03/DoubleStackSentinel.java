package AS03.e03;

import java.util.List;

public class DoubleStackSentinel<T> extends DoubleStack<T> {

    public DoubleStackSentinel(){
        // We initialize the sentinel nodes
        this.head = new Node<T>(null,null,null);
        this.tail = new Node<T>(null,null,null);

        // And already link them with eachother
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    // We initialize a node and set the next node prev value to the new Node
    // We set the next value of the head to the new Node

    public void addFirst(T value){
        Node<T> newNode = new Node<T>(value,head.next,head);
        head.next.prev = newNode;
        head.next = newNode;
        incrementSize();
    }

    // We initialize a node and set the previous node next value to the new Node
    // Prev value of tail Node is set to new Node

    public void addLast(T value){
        Node<T> newNode = new Node<T>(value,tail,tail.prev);
        tail.prev.next = newNode;
        tail.prev = newNode;
        incrementSize();
    }

    public T removeFirst(){
        if(isEmpty()){return null;}
        Node<T> firstNode = head.next;
        head.next = firstNode.next;
        decrementSize();
        return firstNode.data;
    }

    public T removeLast(){
        if(isEmpty()){return null;}
        Node<T> lastNode = tail.prev;
        tail.prev = lastNode.prev;
        lastNode.prev.next = tail;
        decrementSize();
        return lastNode.data;
    }

    public T first(){
        if(isEmpty()){return null;}
        return (T) head.next.data;
    }

    public T last(){
        if(isEmpty()){return null;}
        return (T) tail.prev.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }




}
