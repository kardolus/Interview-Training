package us.kardol.designpattern.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
