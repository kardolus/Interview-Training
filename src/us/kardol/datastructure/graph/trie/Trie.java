package us.kardol.datastructure.graph.trie;

public class Trie {
    Node focus;
    Node[] rootNodes = new Node[26];

    public boolean isEmpty() {
        for(Node node : rootNodes){
            if(node != null){
                return false;
            }
        }
        return true;
    }

    public void add(String word) {
        int index = charToIndex(word.charAt(0));
        if(rootNodes[index] == null){
            rootNodes[index] = new Node(word.charAt(0));
        }

        focus = rootNodes[index];
        char[] charArray = word.toCharArray();

        for(int i = 1; i < charArray.length; i++){
            Node newNode = new Node(charArray[i]);
            index = charToIndex(charArray[i]);
            focus.nodeArray[index] = newNode;
            focus = focus.nodeArray[index];
        }
    }

    public String complete(String word) {
        int index = charToIndex(word.charAt(0));
        focus = rootNodes[index];
        String result = focus.toString();

        for(int i = 0; i < focus.nodeArray.length; i++) {
            if(focus.nodeArray[i] != null){
                focus = focus.nodeArray[i];
                i = 0;
                result += focus.toString();
            }
        }
        return result;
    }

    private int charToIndex(char c){
        return c - 97;
    }
}

class Node{
    Node[] nodeArray = new Node[26];
    char letter;

    Node(char letter){
        this.letter = letter;
    }

    @Override
    public String toString(){
        return String.valueOf(letter);
    }
}
