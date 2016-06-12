package us.kardol.datastructure.graph.redblacktree;

public class RedBlackTree {
    private Node sentinel = new Node(-1); // dummy node to ease dealing with boundary conditions
}

class Node{
    int key;
    Node(int number){
        this.key = number;
    }
    Node leftChild, rightChild;
    Color color = Color.BLACK;
}

enum Color{RED, BLACK}
