package Test.StacksQueues.R64;

public interface IStack<E> {

    public void push(E value);

    public E pop();


    //Access Method

    public E Top();

    public boolean isEmpty();

    public int size();

}
