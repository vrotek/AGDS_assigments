package AS04.e02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bag<E> implements IBag<E> {

    public List<E> elements = new ArrayList<E>();


    @Override
    public void add(E e) {
        elements.add(e);
    }

    @Override
    public E pull() {
        try{
            if(elements.isEmpty()){ throw new EmptyArrayException("Bag has no elements"); }
            Random r = new Random();
            return elements.remove(r.nextInt(0,elements.size()));
        }catch(EmptyArrayException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterator<E> iter() {
        return elements.iterator();
    }

}
