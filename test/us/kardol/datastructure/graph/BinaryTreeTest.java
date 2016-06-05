package us.kardol.datastructure.graph;

import org.junit.Before;
import org.junit.Test;
import us.kardol.datastructure.graph.binarytree.BinaryTree;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/31/16.
 */
public class BinaryTreeTest {
    BinaryTree binaryTree;

    @Before
    public void setUp(){
        binaryTree = new BinaryTree();
    }

    @Test
    public void testAddOne(){
        assertEquals(binaryTree.size(),0);
        assertFalse(binaryTree.contains(5));
        binaryTree.add(5);
        assertEquals(binaryTree.size(), 1);
        assertTrue(binaryTree.contains(5));
    }

    @Test
    public void testAddMany(){
        addMany();
        assertTrue(binaryTree.contains(6));
    }

    @Test
    public void testAddDuplicate(){
        addMany();
        binaryTree.add(2);
        assertEquals(binaryTree.size(), 8);
    }

    @Test
    public void testInOrderTraverse(){
        addMany();
        binaryTree.inOrderTraverse();
    }

    @Test
    public void testPreOrderTraverse(){
        addMany();
        binaryTree.preOrderTraverse();
    }

    @Test
    public void testPostOrderTraverse(){
        addMany();
        binaryTree.postOrderTraverse();
    }

    @Test
    public void testLevelOrderTraverse(){
        addMany();
        System.out.println("Level Order -----------");
        binaryTree.levelOrderTraverse();
        System.out.println("Level Order ----------- end");
    }

    private void addMany(){
        binaryTree.add(4);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(12);
        binaryTree.add(45);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(7);
    }
}