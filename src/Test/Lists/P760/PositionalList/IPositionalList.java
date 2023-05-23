package Test.Lists.P760.PositionalList;

import Test.Lists.P760.Card.Card;

public interface IPositionalList<E> {


    //Access
    public Position<E> first();
    public Position<E> last();
    public Position<E> before(Position<E> p);
    public Position<E> after(Position<E> p);

    //Setter

    public Position<E> addFirst(E value);
    public Position<E> addLast(E value);

    public Position<E> addBefore(Position<E> p ,E value);

    public Position<E> addAfter(Position<E> p,E value);


    public E remove(Position<E> p);

    //Helper
    public boolean isEmpty();

    public int size();

}
