package us.kardol.datastructure.elementary;

public class Stack<T> {
    private int capacity = 10;
    private int size = 0;

    private T[] stack = (T[]) new Object[capacity];

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(T element) {
        stack[size] = element;
        size++;
        copyArray();
    }

    public T pop() {
        stack[size] = null;
        if(size > 0) {
            size--;
        }
        return stack[size];
    }

    public T peek() {
        return stack[size - 1];
    }

    private void copyArray() { // Better performance: use a tail integer to book keep your stack.
        if(size != capacity){
            return;
        }
        capacity *= 2;
        T[] copy = (T[]) new Object[capacity];

        for (int i = 0; i < capacity / 2; i++) {
            copy[i] = stack[i];
        }
        stack = copy;
    }
}
