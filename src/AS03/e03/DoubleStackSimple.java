package AS03.e03;


import java.util.ArrayList;
import java.util.List;

// Similar to DoubleStackSentinel Class however without strict Sentinal Nodes

public class DoubleStackSimple<T> extends DoubleStack<T> {

    // Differenz to other version is that we have to do more checks to see if the head or tail is set
    public void addFirst(T value){
        Node<T> newNode = new Node<T>(value,null,null);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            Node<T> currentHead = head;
            newNode.next = currentHead;
            currentHead.prev = head;
            head = newNode;
        }
        incrementSize();
    }

    public void addLast(T value){
        Node<T> newNode = new Node<T>(value,null,null);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else {
            Node<T> currentTail = tail;
            currentTail.next = newNode;
            newNode.prev = currentTail;
            tail = newNode;
        }
        incrementSize();
    }

    public T removeFirst(){
        if(isEmpty()){return null;}
        Node<T> firstNode = head;
        Node<T> nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
        decrementSize();
        return firstNode.data;

    }

    public T removeLast(){
        if(isEmpty()){return null;}
        Node<T> lastNode = tail;
        Node<T> prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;
        decrementSize();
        return lastNode.data;
    }

    public T first(){
        if(isEmpty()){return null;}
        return (T) head.data;
    }

    public T last(){
        if(isEmpty()){return null;}
        return (T) tail.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


}
