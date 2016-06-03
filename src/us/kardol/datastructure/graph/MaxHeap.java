package us.kardol.datastructure.graph;

import java.util.Arrays;

public class MaxHeap implements Heap {
    private static final int INITIAL_SIZE = 5;

    private int capacity = INITIAL_SIZE;
    private int indexToInsert;
    private Integer[] array = new Integer[capacity];

    @Override
    public boolean isEmpty() {
        return indexToInsert == 0;
    }

    @Override
    public int size() {
        return indexToInsert;
    }

    @Override
    public void insert(Integer value) {
        copyArray();
        array[indexToInsert] = value;
        bubbleUp(indexToInsert);
        indexToInsert++;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public Integer peek() {
        return array[0];
    }

    @Override
    public Integer pop() {
        Integer result = array[0];
        if(indexToInsert > 0) {
            array[0] = array[indexToInsert - 1];
            array[indexToInsert - 1] = null;
            indexToInsert--;
            bubbleDown(0);
        }
        return result;
    }

    private void bubbleUp(int index) {
        if(index > 0){
            swap(index);
            bubbleUp(getParent(index));
        }
    }

    private void bubbleDown(int index){
        Integer focus = swapDown(index);
        if(hasChild(index) && focus != null){
            bubbleDown(focus);
        }
    }

    private boolean hasChild(int index) {
        return size() - 4 > getIndexLeftChild(index);
    }

    private void swap(int index) {
        int tmp;
        if(array[index] > array[getParent(index)]){
            tmp = array[getParent(index)];
            array[getParent(index)] = array[index];
            array[index] = tmp;
        }
    }

    private Integer swapDown(int index) {
        int tmp;
        if(array[index] < array[getIndexLeftChild(index)] ||
                (getIndexRightChild(index) < size() && array[index] < array[getIndexRightChild(index)])){
            if(getIndexRightChild(index) >= size() || array[getIndexLeftChild(index)] > array[getIndexRightChild(index)]) {
                tmp = array[getIndexLeftChild(index)];
                array[getIndexLeftChild(index)] = array[index];
                array[index] = tmp;
                return getIndexLeftChild(index);
            }else{
                tmp = array[getIndexRightChild(index)];
                array[getIndexRightChild(index)] = array[index];
                array[index] = tmp;
                return getIndexRightChild(index);
            }
        }
        return null;
    }

    private void copyArray(){
        if(capacity == indexToInsert){
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    private int getIndexLeftChild(int index){
        return 2 * index + 1;
    }

    private int getIndexRightChild(int index){
        return getIndexLeftChild(index) + 1;
    }

    private int getParent(int index){
        return (index - 1)/2;
    }
}
