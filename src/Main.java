import java.util.*;

public class Main {

    static Stack<Integer> s;
    public static boolean contains(int x){
        Deque<Integer> q = new LinkedList<>();
        boolean exists = false;

        while(!s.isEmpty()){
            int current = s.pop();

            if(x == current){
                exists = true;
                break;
            }else {
                q.addFirst(current);
            }
        }


        while(!q.isEmpty()){
            s.push(q.removeFirst());
        }

        return exists;
    }
    public static void main(String[] args) {

        int[] n = {0,1,2,3,4,5,6,7,8,9};

        int x = 20;

        s = new Stack<>();


        for(int i = 0; i < n.length; i++){
            s.push(n[i]);
        }

        System.out.println("Original Order: " + s.toString());

        System.out.println(x + " " + (contains(x) ? "is in the stack":"is not in the stack"));
        System.out.println("After calling contains: " + s.toString());


    }
}