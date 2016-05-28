package us.kardol.datastructure.elementary;

import java.util.Arrays;

public class Set<T> {
    private static int INITIAL_CAPACITY = 10;
    private boolean empty = true;
    private int size = 0;
    private int capacity = INITIAL_CAPACITY;
    private T[] set = (T[]) new Object[capacity];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if(this.contains(element)){
            return;
        }
        copy();
        set[size] = element;
        size++;
    }

    public void clear() {
        capacity = INITIAL_CAPACITY;
        set = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        for(T t : set){
            if(t == null){
                return false;
            }
            if(t.equals(element)){
                return true;
            }
        }
        return false;
    }

    private void copy(){
        if(size == capacity){
            capacity *= 2;
            set = Arrays.copyOf(set, capacity);
        }
    }
}
