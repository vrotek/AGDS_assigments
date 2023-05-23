package AS06.e02.PriorityQueue;

public interface IPriorityQueue<K,V> {
    int size();
    boolean isEmpty();

    IEntry<K,V> insert(K key, V value) throws IllegalArgumentException;

    IEntry<K,V> min();

    IEntry<K,V> removeMin();

}
