package AS03.e03;

// Abstract Datatype implementation
public interface IDoubleStack<T> {

    public void addFirst(T value);
    public void addLast(T value);
    public T removeFirst();
    public T removeLast();

    public T first();

    public T last();
    public int size();

    public boolean isEmpty();

}
