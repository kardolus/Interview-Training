package us.kardol.datastructure.elementary;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.*;

public class HashMapTest {
    private HashMap hashMap;

    @Before
    public void setUp(){
        hashMap = new HashMap();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(hashMap.isEmpty());
        hashMap.put("key1", "value");
        assertFalse(hashMap.isEmpty());
    }

    @Test
    public void testAddMany(){
        addMany();
        assertEquals(hashMap.size(), 5);
    }

    @Test
    public void testGetKey(){
        addMany();
        assertEquals(hashMap.get("key1a"), "value1");
        assertEquals(hashMap.get("key2a"), "value2");
        assertEquals(hashMap.get("key3"), "value3");
        assertEquals(hashMap.get("key5"), "value5");
        assertEquals(hashMap.get("key4"), "value4");
    }

    @Test
    public void testAddDuplicate(){
        addMany();
        hashMap.put("key4", "new value");
        assertEquals(hashMap.size(), 5);
        assertEquals(hashMap.get("key4"), "new value");
    }

    @Test
    public void testKeySet(){
        addMany();
        Set<String> result = hashMap.keySet();
        Set<String> expected = new HashSet<>();
        expected.add("key5");
        expected.add("key2a");
        expected.add("key3");
        expected.add("key4");
        expected.add("key1a");
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testValues(){
        addMany();
        List<String> result = hashMap.values();
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        expected.add("value4");
        expected.add("value5");
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testRemove(){
        addMany();
        hashMap.remove("key3");
        assertEquals(hashMap.size(), 4);
        assertNull(hashMap.get("key3"));
        hashMap.remove("key5");
        assertEquals(hashMap.size(), 3);
        assertNull(hashMap.get("key5"));
    }

    @Test
    public void testContainsKey(){
        addMany();
        assertTrue(hashMap.containsKey("key3"));
    }

    private void addMany() {
        hashMap.put("key1a", "value1");
        hashMap.put("key2a", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");
        hashMap.put("key5", "value5");
    }
}