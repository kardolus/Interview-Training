package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue<String> queue;

    @Before
    public void setUp(){
        queue = new Queue<>();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAddOne(){
        addOne();
        assertFalse(queue.isEmpty());
        assertEquals(queue.peek(), "ab");
    }

    @Test
    public void testAddMany(){
        addMany();
        assertEquals(queue.peek(), "ab");
    }

    @Test
    public void testAddTooMany(){
        addMany();
        addMany();
        addMany();
        addMany();
    }

    @Test
    public void testPoll(){
        addMany();
        assertEquals(queue.poll(), "ab");
        assertEquals(queue.size(), 4);
        assertEquals(queue.poll(), "md");
    }

    @Test
    public void testPullWithoutAdding(){
        assertEquals(queue.poll(), null);
    }

    private void addOne(){
        queue.offer("ab");
    }
    private void addMany(){
        queue.offer("ab");
        queue.offer("md");
        queue.offer("zk");
        queue.offer("AA");
        queue.offer("22");
    }
}