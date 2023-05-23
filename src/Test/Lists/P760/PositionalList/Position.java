package Test.Lists.P760.PositionalList;

public class Position<E> implements IPosition<E> {

    protected E value;
    protected  Position<E> next;
    protected Position<E> previous;

    public Position(Position<E> prev, E value, Position<E> next){
        this.value = value;
        this.previous = prev;
        this.next = next;
    }
    @Override
    public E getElement() {
        return this.value;
    }

    @Override
    public void setElement(E newValue) {
        this.value = newValue;
    }

    public Position<E> getNext() {
        return next;
    }

    public void setNext(Position<E> next) {
        this.next = next;
    }

    public Position<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Position<E> previous) {
        this.previous = previous;
    }
}
