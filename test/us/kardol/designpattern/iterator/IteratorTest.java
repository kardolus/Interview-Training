package us.kardol.designpattern.iterator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {
    private Iterator<String> iterator;
    private Aggregate<String> aggregate;

    @Before
    public void setUp(){
        String[] array = {"a", "b", "c", "d", "e", "f"};
        aggregate = new ConcreteAggregate<>(array);
        iterator = aggregate.createIterator();
    }

    @Test
    public void testIterator(){
        String result = "";
        while(iterator.hasNext()){
            result += iterator.next();
        }
        assertFalse(iterator.hasNext());
        assertEquals("abcdef", result);
    }
}