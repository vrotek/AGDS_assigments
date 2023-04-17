package AS04.e02;

import java.util.Iterator;

public class main {

    public static void test(Bag<Integer> b){
        b.add(1); b.add(2); b.add(3); b.add(4); b.add(5);
        System.out.println("["+b.elements.toString()+"] : ");
        System.out.println("["+b.elements.toString()+"] : " + b.pull());
        System.out.println("["+b.elements.toString()+"] : " + b.pull());
        System.out.println("["+b.elements.toString()+"] : " + b.pull());
        Iterator<Integer> I = b.iter();
        System.out.println("["+b.elements.toString()+"] : ");
        System.out.println("["+b.elements.toString()+"] : " + I.next());
        System.out.println("["+b.elements.toString()+"] : " + I.next());
        System.out.println("["+b.elements.toString()+"] : " + I.hasNext());
    }

    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        test(bag);

    }
}
