package AS04.e03;

import java.util.Iterator;

public class main {

    public static void print(ArrayPositionalList<Integer> list){
        Iterator<Integer> iterator =  list.iterator();

    }
    public static void test(ArrayPositionalList<Integer> list){
        list.addFirst(10);
        print(list);
        list.addLast(1);
        Position<Integer> p  = list.addAfter(list.addFirst(5),8);
        list.addAfter(list.first(), 2);
        list.addAfter(list.after(p),9);
        list.remove(list.before(list.before(p)));
        list.set(p, 4);
        list.addAfter(list.first(), 7);
        list.addBefore(list.last(), 6);
    }

    public static void main(String[] args) {
        ArrayPositionalList<Integer> l = new ArrayPositionalList<>();
        test(l);
    }
}
