package us.kardol.datastructure.elementary;

import java.util.Arrays;

/**
 * Created by gkardol on 5/24/16.
 */
public class Queue<T> {
    private int size = 0;
    private int realSize = 0;
    private int head = 0;
    private int capacity = 10;
    private T[] queue = (T[]) new Object[capacity];

    public void offer(T element) {
        queue[size] = element;
        size++;
        realSize++;
        copyArray();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        return queue[head];
    }

    public T poll() {
        size--;
        head++;
        return queue[head - 1];
    }

    public int size() {
        return size;
    }

    private void copyArray(){
        if(realSize != capacity){
            return;
        }
        capacity *= 2;
        T[] copy = (T[]) new Object[capacity];
        copy = Arrays.copyOf(queue, capacity);
        queue = copy;
    }
}
