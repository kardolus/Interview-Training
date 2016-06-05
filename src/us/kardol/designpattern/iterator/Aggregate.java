package us.kardol.designpattern.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
