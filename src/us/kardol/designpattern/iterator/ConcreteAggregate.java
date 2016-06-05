package us.kardol.designpattern.iterator;

public class ConcreteAggregate<T> implements Aggregate {
    private T[] array;
    public ConcreteAggregate(T[] array){
        this.array = array;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(array);
    }
}
