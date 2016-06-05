package us.kardol.datastructure.graph;

import org.junit.Before;
import org.junit.Test;
import us.kardol.datastructure.graph.heap.Heap;
import us.kardol.datastructure.graph.heap.MaxHeap;

import static org.junit.Assert.*;

public class MaxHeapTest {
    private Heap heap;

    @Before
    public void setUp(){
        heap = new MaxHeap();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testInsertOne(){
        heap.insert(5);
        assertEquals(heap.size(), 1);
        assertEquals(heap.isEmpty(), false);
    }

    @Test
    public void testAddMany(){
        addMany();
        assertEquals(heap.size(), 10);
    }

    @Test
    public void testPrint(){
        addMany();
        heap.print();
    }

    @Test
    public void testPeek(){
        addMany();
        assertEquals(heap.peek(), Integer.valueOf(88));
    }

    @Test
    public void testPop(){
        addMany();
        assertEquals(heap.pop(), Integer.valueOf(88));
        heap.print();
    }

    private void addMany(){
        heap.insert(6);
        heap.insert(62);
        heap.insert(21);
        heap.insert(7);
        heap.insert(14);
        heap.insert(88);
        heap.insert(4);
        heap.insert(3);
        heap.insert(4);
        heap.insert(3);
    }

}