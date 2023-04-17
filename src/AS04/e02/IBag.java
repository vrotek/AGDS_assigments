package AS04.e02;

import java.util.Iterator;

public interface IBag<E> {
    void add(E e);

    E pull();

    Iterator<E> iter();

}
