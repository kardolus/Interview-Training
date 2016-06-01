package us.kardol.datastructure.graph;

import java.util.LinkedList;

public class BinaryTree {
    Node root;
    Node focus;
    Node parent = null;

    private int size = 0;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            size++;
            return;
        }
        focus = root;

        while (focus != null) {
            parent = focus;
            if (data < focus.data) {
                focus = focus.leftChild;
            } else if (data > focus.data) {
                focus = focus.rightChild;
            } else {
                return;
            }
        }

        if (parent.data < data) {
            parent.rightChild = new Node(data);
        } else {
            parent.leftChild = new Node(data);
        }
        size++;
    }

    public void inOrderTraverse() {
        this.inOrderTraverse(root);
    }

    public void preOrderTraverse() {
        this.preOrderTraverse(root);
    }

    public void postOrderTraverse() {
        this.postOrderTraverse(root);
    }

    // depth first
    private void inOrderTraverse(Node node) {
        if (node.leftChild != null)
            inOrderTraverse(node.leftChild);
        System.out.println(node.data);
        if (node.rightChild != null)
            inOrderTraverse(node.rightChild);
    }

    private void preOrderTraverse(Node node) {
        System.out.println(node.data);
        if (node.leftChild != null)
            preOrderTraverse(node.leftChild);
        if (node.rightChild != null)
            preOrderTraverse(node.rightChild);
    }

    private void postOrderTraverse(Node node) {
        if (node.leftChild != null)
            postOrderTraverse(node.leftChild);
        if (node.rightChild != null)
            postOrderTraverse(node.rightChild);
        System.out.println(node.data);
    }

    // breadth first (for example to find your N-ordered LinkedIn connections).
    public void levelOrderTraverse() {
        levelOrderTraverse(root);
    }

    private void levelOrderTraverse(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        Node tmpNode;
        while (queue.size() != 0) {
            tmpNode = queue.pop();
            System.out.println(tmpNode.data);
            if (tmpNode.leftChild != null) {
                queue.add(tmpNode.leftChild);
            }
            if (tmpNode.rightChild != null) {
                queue.add(tmpNode.rightChild);
            }
        }
    }

    // TODO
    // Remove a node by rotating the tree:
    // If leftchild and rightchild are null: remove the node
    // If only the leftChild is null: swap the node with the right child
    // if only the rightChild is null: swap with left child
    // if no children are null: swap with any child.
    // repeat until the node to remove has no children left.

    public int size() {
        return size;
    }

    public boolean contains(int data) {
        focus = root;
        while (focus != null) {
            if (data < focus.data) {
                focus = focus.leftChild;
            } else if (data > focus.data) {
                focus = focus.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }
}

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int data) {
        this.data = data;
    }
}
