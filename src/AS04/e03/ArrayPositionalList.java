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
    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        try {
            int index = positions.indexOf(p);

            if(index == -1){
                throw new IllegalArgumentException("Position not valid");
            }else if(index == 0){
                return null;
            }

            return positions.get(index-1);

        } catch (IllegalArgumentException exc){
            return null;
        }
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        try {
            int index = positions.indexOf(p);

            if(index == -1){
                throw new IllegalArgumentException("Position not valid");
            }else if(index == positions.size()-1){
                return null;
            }

            return positions.get(index+1);
        }catch(IllegalArgumentException exc){
            return null;
        }
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

        positions.add(0,newElement);

        return newElement;
    }

    @Override
    public Position<E> addLast(E e) {
        Element<E> newElement = new Element<>(e);
        positions.add(newElement);
        return newElement;
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
        try {
            Element<E> newElement = new Element<>(e);
            int index = positions.indexOf(p);

            if (index == -1) {
                throw new IllegalArgumentException("Position not valid");
            }



            positions.add(index, newElement);

            return newElement;
        }catch(IllegalArgumentException exc){
            return null;
        }
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
        try {
            Element<E> newElement = new Element<>(e);
            int index = positions.indexOf(p);

            if(index == -1){
                throw new IllegalArgumentException("Position not valid");
            }



            positions.add(index+1,newElement);

            return newElement;


        } catch(IllegalArgumentException exc){
            return null;
        }

    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
        try {
            int index = positions.indexOf(p);

            if(index == -1){
                throw new IllegalArgumentException("Position not valid");
            }

            Position<E> removedElement = positions.get(index);

            positions.remove(p);
            return removedElement.getElement();

        } catch(IllegalArgumentException exc){
            return null;
        }
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        try {
            Element<E> newElement = new Element<>(e);
            int index = positions.indexOf(p);

            if(index == -1){
                throw new IllegalArgumentException("Position not valid");
            }

            Element<E> oldElement = (Element<E>) positions.get(index);

            positions.set(index, newElement);

            return oldElement.getElement();
        }catch(IllegalArgumentException exc){
            return null;
        }
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
