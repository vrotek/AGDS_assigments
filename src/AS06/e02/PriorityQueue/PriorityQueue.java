package AS06.e02.PriorityQueue;

import java.util.Comparator;

public abstract class PriorityQueue<K, V> implements IPriorityQueue<K,V> {

    private Comparator<K> comp;

    public PriorityQueue(Comparator<K> c){ comp = c;}

    protected int compare(IEntry<K,V> a, IEntry<K,V> b){
        return comp.compare(a.getKey(), b.getKey());
    }

    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key,key) == 0);
        }catch(ClassCastException e){
            throw new IllegalArgumentException("Incompatible key");
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IEntry<K, V> insert(K key, V value) throws IllegalArgumentException {
        return null;
    }

    @Override
    public IEntry<K, V> min() {
        return null;
    }

    @Override
    public IEntry<K, V> removeMin() {
        return null;
    }
}
