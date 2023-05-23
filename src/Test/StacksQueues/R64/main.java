package Test.StacksQueues.R64;

public class main {


    public static IStack transfer(IStack S, IStack T){

        while(!S.isEmpty()){
            T.push(S.pop());
        }

        return T;
    }

    public static void main(String[] args) {
        IStack<Integer> stack1 = new ArrayStack<>(1000);
        IStack<Integer> stack2 = new ArrayStack<>(1000);

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        stack2 = transfer(stack1,stack2);

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

    }
}
