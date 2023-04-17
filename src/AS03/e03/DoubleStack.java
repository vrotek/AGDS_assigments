package AS03.e03;

// Datastructure implementation implementing the print function
// and additionally increaseSize() and decreaseSize() helper functions

public abstract class DoubleStack<T> implements IPrintable, IDoubleStack<T> {
    protected Node<T> head;
    protected Node<T> tail;
    protected int size;

    public void addFirst(T value){

    }
    public void addLast(T value){

    }
    public T removeFirst(){
        return null;
    }
    public T removeLast(){
        return null;
    }

    public T first(){
        return null;
    }

    public T last(){
        return null;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Double Stack empty");
            return;
        }
        Node<T> current = head.data == null ? head.next:head;
        int index = 1;
        while(current != null && current.data != null){
            System.out.println("[" +(index++)+ "]: " + current.data);
            current = current.next;
        }

        System.out.println();

    }

    protected void incrementSize(){
        size += 1;
    }

    protected void decrementSize(){
        size -= 1;
    }
}
