package AS03.e03;

public class main {
    
    public static void testDoubleStack(DoubleStack dStack){
        dStack.print();
        dStack.addFirst(3);
        dStack.print();
        dStack.addFirst(4);
        dStack.print();
        dStack.addLast(2);
        dStack.print();
        dStack.last();
        dStack.print();
        System.out.println("Removed Item should be 2: " + dStack.removeLast());
        dStack.print();
        System.out.println("Show first element (4): " +  dStack.first());
        dStack.print();
        System.out.println("Removed Item should be 4: " + dStack.removeFirst());
        dStack.print();
        System.out.println("Size should be (1): " +  dStack.size());
        dStack.print();
        System.out.println("IsEmpty should be false: " +  dStack.isEmpty());
        dStack.print();
    }
    public static void main(String[] args) {

        // We create both versions of the DoubleStack Datastructure

        DoubleStack<Integer> doubleStackWithSentinels = new DoubleStackSentinel<Integer>();
        DoubleStack<Integer> doubleStackSimple = new DoubleStackSimple<>();

        // And Test their functionality
        
        testDoubleStack(doubleStackWithSentinels);
        testDoubleStack(doubleStackSimple);
    }
}
