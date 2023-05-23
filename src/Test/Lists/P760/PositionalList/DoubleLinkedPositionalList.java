package Test.Lists.P760.PositionalList;

import Test.Lists.P760.Card.Card;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedPositionalList<E> implements IPositionalList<E> {

    private class PositionIterator implements Iterator<Position<E>> {
        private Position<E> cursor = first();
        private Position<E> recent = null;
        public boolean hasNext( ) { return (cursor != null); }

        public Position<E> next( ) throws NoSuchElementException {
            if (cursor == null) throw new NoSuchElementException("nothing left");
            recent = cursor;
            cursor = after(cursor);
            return recent;
        }
    }

    private class PositionIterable implements Iterable<Position<E>> {
        public Iterator<Position<E>> iterator() {
            return new PositionIterator();
        }
    }

    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> posIterator = new PositionIterator( );
        public boolean hasNext( ) { return posIterator.hasNext( ); }
        public E next( ) { return posIterator.next( ).getElement( ); }
        public void remove( ) { posIterator.remove( ); }
    }

    private Position<E> header;
    private Position<E> trailer;

    private int size = 0;

    public DoubleLinkedPositionalList(){
        this.header = new Position<E>(null,null,null);
        this.trailer = new Position<E>(this.header,null,null);

        this.header.next = this.trailer;
    }

    @Override
    public Position<E> first() {
        if(isEmpty()){return null;}
        return this.header.next;
    }

    @Override
    public Position<E> last() {
        if(isEmpty()){return null;}
        return this.trailer.previous;
    }

    @Override
    public Position<E> before(Position<E> p) {
        return p.previous;
    }

    @Override
    public Position<E> after(Position<E> p) {
        return p.next;
    }

    @Override
    public Position<E> addFirst(E value) {
        Position<E> position = new Position<>(null,value,null);
        addInBetween(this.header,position,this.header.next);
        this.size++;
        return position;
    }

    @Override
    public Position<E> addLast(E value) {
        Position<E> position = new Position<>(null,value,null);
        addInBetween(this.trailer.previous,position,this.trailer);
        this.size++;
        return position;
    }

    @Override
    public Position<E> addBefore(Position<E> p, E value) {
        Position<E> position = new Position<>(null,value,null);
        addInBetween(p.previous,position,p);
        this.size++;
        return position;
    }

    @Override
    public Position<E> addAfter(Position<E> p, E value) {
        Position<E> position = new Position<>(null,value,null);
        addInBetween(p,position,p.next);
        this.size++;
        return position;
    }

    @Override
    public E remove(Position<E> p) {
        Position<E> prev = p.previous;
        Position<E> next = p.next;

        prev.next = next;
        next.previous = prev;

        return p.getElement();
    }

    public void addInBetween(Position<E> prev, Position<E> insert, Position<E> next){
        prev.next = insert;
        next.previous = insert;
        insert.previous = prev;
        insert.next = next;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    public Iterator<E> iterator( ) { return new ElementIterator( ); }

    public Iterable<Position<E>> positions() {
        return new PositionIterable();
    }

}
