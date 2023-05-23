package AS06.e02.PriorityQueue;

public class PQEntry<K,V> implements IEntry<K,V> {

    private K key;
    private V value;

    public PQEntry(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
