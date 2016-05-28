package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList arrayList;

    @Before
    public void setUp(){
        arrayList = new ArrayList();
    }

    @Test
    public void testIsEmpty(){
        assertEquals(arrayList.isEmpty(), true);
    }

    @Test
    public void testAddOne(){
        addOne();
        assertEquals(arrayList.isEmpty(), false);
        assertEquals(arrayList.size(), 1);
    }

    @Test
    public void testAddTooMany(){
        addMany();
        addMany();
        addMany();
        addMany();
        assertEquals(arrayList.size(), 20);
        assertEquals(arrayList.get(4), "g");
    }

    @Test
    public void testRemove(){
        addMany();
        arrayList.remove(2);
        assertEquals(arrayList.size(), 4);
        assertEquals(arrayList.get(2), "ae");
    }

    @Test
    public void testClear(){
        arrayList.clear();
        assertEquals(arrayList.size(), 0);
    }

    private void addOne(){
        arrayList.add("a");
    }

    private void addMany(){
        arrayList.add("a");
        arrayList.add("y");
        arrayList.add("h");
        arrayList.add("ae");
        arrayList.add("g");
    }
}