package AS04.e03;

import java.util.Iterator;

public interface IPositionalList<E> extends Iterable<E> {

    Position<E> first();

    Position<E> last();

    Position<E> before(Position<E> p);

    Position<E> after(Position<E> p);

    int size();

    boolean isEmpty();

    Position<E> addFirst(E e);

    Position<E> addLast(E e);

    Position<E> addBefore(Position<E> p, E e);

    Position<E> addAfter(Position<E> p, E e);



    E remove(Position<E> p);

    E set(Position<E> p, E e);

    Iterator<E> iterator();

    Iterable<Position<E>> positions();


}
