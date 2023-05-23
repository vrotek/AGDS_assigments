package Test.StacksQueues.R64;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ArrayStack<E> implements IStack<E> {

    private E[] elements;
    private int n = 0;

    public ArrayStack(int maxSize){
        this.elements = (E[]) new Object[maxSize];

    }

    @Override
    public void push(E value) {
        this.elements[n] = value;
        this.n++;

    }

    @Override
    public E pop() {

        E element = this.elements[n-1];
        this.n--;
        return element;
    }

    @Override
    public E Top() {
        return this.elements[n-1];
    }

    @Override
    public boolean isEmpty() {
        return this.n == 0;
    }

    @Override
    public int size() {
        return this.n;
    }


}
