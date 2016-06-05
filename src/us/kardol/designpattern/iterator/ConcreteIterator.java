package us.kardol.designpattern.iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private int position = 0;
    private T[] array;

    public ConcreteIterator(T[] items){
        this.array = items;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public T next() {
        if(position == array.length){
            throw new IllegalStateException();
        }
        return array[position++];
    }

    @Override
    public void remove() {
        // implementation here
    }
}
