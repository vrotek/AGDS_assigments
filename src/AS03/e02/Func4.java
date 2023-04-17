package AS03.e02;

public class Func4 {

    public static int func4(int base, int exponent, int accumulator){
        if(exponent == 1){
            //base-case
            return accumulator;
        }else{
            return func4(base, exponent-1, base * accumulator);
        }

    }

    public static int func1(int x, int n){
        if(n == 0) {
            System.out.println(x + " " + n);
            return 1;
        }
        int p = func1(x,n/2);
        if(n % 2 == 0){
            System.out.println(x + " " + n);
            return p * p;
        }else {
            System.out.println(x + " " + n);
            return x * p * p;
        }

    }
    public static void main(String[] args) {
        System.out.println(func1(4,5));
    }
}
