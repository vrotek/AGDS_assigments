package AS04.e03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayPositionalList<E> implements IPositionalList<E> {

    private List<Position<E>> positions = new ArrayList<>();
    @Override
    public Position<E> first() {
        return positions.get(0);
    }

    @Override
    public Position<E> last() {
        return positions.get(positions.size()-1);
    }

    @Override
    public Position<E> before(Position<E> p) {
        return null;
    }

    @Override
    public Position<E> after(Position<E> p) {
        return null;
    }

    @Override
    public int size() {
        return positions.size();
    }

    @Override
    public boolean isEmpty() {
        return positions.isEmpty();
    }

    @Override
    public Position<E> addFirst(E e) {
        Element<E> newElement = new Element<>(e);
        positions.add(newElement);
        return newElement;
    }

    @Override
    public Position<E> addLast(E e) {
        Element<E> newElement = new Element<>(e);
        positions.add(positions.size()-1,newElement);
        return newElement;
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) {
        Element<E> newElement = new Element<>(e);
        int index = positions.indexOf(p);
        for(int i = positions.size()-1;i >= index-1;i--){
            Position<E> current = positions.get(i);
            positions.set(i+1,current);
        }

        positions.set(index-1,newElement);

        return newElement;
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) {
        Element<E> newElement = new Element<>(e);
        int index = positions.indexOf(p);

        for(int i = positions.size()-1;i > index;i--){
            Position<E> current = positions.get(i);
            positions.set(i+1,current);
        }

        positions.set(index+1,newElement);
        return newElement;
    }

    @Override
    public E remove(Position<E> p) {
        Position<E> removedElement = positions.get(positions.indexOf(p));
        positions.remove(p);
        return removedElement.getElement();
    }

    @Override
    public E set(Position<E> p, E e) {
        Element<E> newElement = new Element<>(e);
        int index = positions.indexOf(p);
        Element<E> oldElement = (Element<E>) positions.get(index);

        positions.set(index, newElement);

        return oldElement.getElement();
    }

    @Override
    public Iterator<E> iterator() {
        List<E> list = new ArrayList<>();
        positions().forEach(position -> {
            list.add(position.getElement());
        });

        return list.iterator();
    }

    @Override
    public Iterable<Position<E>> positions() {
        return positions;
    }
}
