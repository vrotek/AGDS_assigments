package AS04.e03;

public class Element<E> implements Position<E> {

    private E element;

    public Element(E element){
        this.element = element;
    }
    @Override
    public E getElement() throws IllegalStateException {
        try {
            if(element == null){
                throw new IllegalStateException("Position no longer valid");
            }
            return element;
        }catch(IllegalStateException e){
            return null;
        }

    }
}
