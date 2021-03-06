package us.kardol.datastructure.graph.trie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {
    private Trie trie;

    @Before
    public void setUp(){
        trie = new Trie();
    }

    @Test
    public void testIsEmpty(){
        assertTrue(trie.isEmpty());
    }

    @Test
    public void testAddOne(){
        trie.add("apple");
        assertEquals(trie.complete("a").toString(), "apple");
    }

    @Test
    public void testAddMany(){
        addMany();
        assertEquals(trie.complete("ap").toString(), "ape");
        assertEquals(trie.complete("a").toString(), "ape");
        assertEquals(trie.complete("app").toString(), "apple");
        assertEquals(trie.complete("appm").toString(), "appman");
    }

    @Test
    public void testContains(){
        addMany();
        assertTrue(trie.contains("ape"));
        assertFalse(trie.contains("batman"));
    }

    private void addMany(){
        trie.add("apple");
        trie.add("ape");
        trie.add("appman");
    }
}