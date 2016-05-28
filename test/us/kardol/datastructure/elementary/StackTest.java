package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack<String> stack;

    @Before
    public void setUp(){
        stack = new Stack<>();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testAddOne(){
        addOne();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testAddTooMany(){
        addMany();
        addMany();
        addMany();
        assert(stack.size() == 15);
    }

    @Test
    public void testPop(){
        addMany();
        assertEquals(stack.pop(), "e");
        assertEquals(stack.size(), 4);
        assertEquals(stack.pop(), "d");
        assertEquals(stack.size(), 3);
    }

    @Test
    public void testPopTooMany(){
        addOne();
        assertEquals(stack.pop(), "a");
        assertNull(stack.pop());
        assertEquals(stack.size(), 0);
    }

    @Test
    public void testPeek(){
        addMany();
        assertEquals(stack.peek(), "e");
        assertEquals(stack.size(), 5);
    }

    private void addOne(){
        stack.push("a");
    }

    private void addMany(){
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
    }
}