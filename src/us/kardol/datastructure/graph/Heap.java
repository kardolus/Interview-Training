package us.kardol.datastructure.graph;

public interface Heap {
    boolean isEmpty();
    int size();
    void insert(Integer value);
    void print();
    Integer peek();
    Integer pop();
}
