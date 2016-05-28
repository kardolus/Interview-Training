package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList<Integer> linkedList;

    @Before
    public void setUp(){
        linkedList = new LinkedList<>();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testAddOne(){
        linkedList.add(5);
        assertFalse(linkedList.isEmpty());
        assertEquals(linkedList.size(), 1);
    }

    @Test
    public void testAddMany(){
        addMany();
        assertEquals(linkedList.size(), 5);
    }

    @Test
    public void ultraTest(){
        linkedList.add(1);
        linkedList.add(0);
        linkedList.remove(0);
        assertEquals(1,linkedList.size());

        linkedList.remove(0);
        assertEquals(1,linkedList.size());
    }

    @Test
    public void ultraTestReloaded(){
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.removeAll(1);
        assertEquals(0, linkedList.size());
    }

    @Test
    public void ultraTestRevolution(){
        int n= (int) Math.random();
        linkedList.add(n);

        int m = (int) Math.random();
        linkedList.add(m);

        int expectedSize = 1;
        if(n == m){
            expectedSize = 0;
        }
        linkedList.removeAll(n);
        assertEquals(expectedSize, linkedList.size());
    }

    @Test
    public void testPeek(){
        addMany();
        assertEquals(linkedList.peek(), new Integer(5));
    }

    @Test
    public void testPeekFirst(){
        addMany();
        assertEquals(linkedList.peekFirst(), new Integer(5));
    }

    @Test
    public void testPeekLast(){
        addMany();
        assertEquals(linkedList.peekLast(), new Integer(3));
    }

    @Test
    public void testPop(){
        addMany();
        assertEquals(linkedList.pop(), new Integer(5));
        assertEquals(linkedList.size(), 4);
    }

    @Test
    public void testPull(){
        addMany();
        assertEquals(linkedList.pull(), new Integer(3));
        assertEquals(linkedList.size(), 4);
    }

    private void addMany(){
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(10);
        linkedList.add(3);
    }
}