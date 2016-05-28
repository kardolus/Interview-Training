package us.kardol.datastructure.elementary;

import java.util.Arrays;

public class ArrayList<T> {
    private static int INITIAL_CAPACITY = 10;
    private int capacity = INITIAL_CAPACITY, size = 0;
    private T[] list = (T[]) new Object[INITIAL_CAPACITY];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        list[size] = element;
        size++;
        copyArray();
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        return list[i];
    }

    public void remove(int i) {
        list[i] = null;
        fillTheHoles();
        size--;
    }

    public void clear() {
        list = (T[]) new Object[INITIAL_CAPACITY];
    }

    private void fillTheHoles(){
        T[] copy = (T[]) new Object[capacity];
        int count = 0;
        for (int i = 0; i < capacity; i++) {
            if(list[i] != null) {
                copy[count] = list[i];
                count++;
            }
        }
        list = copy;
    }

    private void copyArray() {
        if(size != capacity){
            return;
        }
        capacity *= 2;
        T[] copy = (T[]) new Object[capacity];

        for (int i = 0; i < capacity / 2; i++) {
            copy[i] = list[i];
        }
        list = copy;
    }
}
