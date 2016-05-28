package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {
    Set<String> set;

    @Before
    public void setUp(){
        set = new Set<>();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAddOne(){
        addOne();
        assertFalse(set.isEmpty());
    }

    @Test
    public void testContains(){
        addMany();
        assertTrue(set.contains("a"));
        assertTrue(set.contains("b"));
        assertFalse(set.contains("f"));
    }

    @Test
    public void testClear(){
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testSize(){
        addMany();
        assertEquals(set.size(), 5);
        set.clear();
        addOne();
        assertEquals(set.size(), 1);
    }

    @Test
    public void testAddDuplicate(){
        addOne();
        addOne();
        assertEquals(set.size(), 1);
    }

    @Test
    public void testAddTooMany(){
        addTooMany();
        assertEquals(set.size(), 15);
    }

    private void addOne(){
        set.add("a");
    }

    private void addMany(){
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
    }

    private void addTooMany(){
        addMany();
        set.add("f");
        set.add("g");
        set.add("h");
        set.add("i");
        set.add("j");
        set.add("k");
        set.add("l");
        set.add("m");
        set.add("n");
        set.add("o");
    }
}