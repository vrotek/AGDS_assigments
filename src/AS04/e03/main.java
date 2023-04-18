package AS04.e03;

import java.util.Iterator;

public class main {

    public static String printPositions(ArrayPositionalList<Integer> list){
        Iterator<Integer> iterator =  list.iterator();
        String printString = "[";

        int index = 1;
        while(iterator.hasNext()){
            printString += iterator.next() + (index == list.size() ? "":" ");
            index++;
        }
        printString += "]";
        return printString;
    }
    public static void test(ArrayPositionalList<Integer> list){
        Position<Integer> t = list.addFirst(10);
        System.out.println(printPositions(list) + " : " + t.getElement());
        t = list.addLast(1);
        System.out.println(printPositions(list) + " : " + t.getElement());
        Position<Integer> p  = list.addAfter(list.addFirst(5),8);
        System.out.println(printPositions(list) + " : " + p.getElement());
        t = list.addAfter(list.first(), 2);
        System.out.println(printPositions(list) + " : " + t.getElement());
        t = list.addAfter(list.after(p),9);
        System.out.println(printPositions(list) + " : " + t.getElement());
        Integer e = list.remove(list.before(list.before(p)));
        System.out.println(printPositions(list) + " : " + e);
        e = list.set(p, 4);
        System.out.println(printPositions(list) + " : " + e);
        t = list.addAfter(list.first(), 7);
        System.out.println(printPositions(list) + " : " + t.getElement());
        t = list.addBefore(list.last(), 6);
        System.out.println(printPositions(list) + " : " + t.getElement());
    }

    public static void main(String[] args) {
        ArrayPositionalList<Integer> l = new ArrayPositionalList<>();
        test(l);
    }
}
