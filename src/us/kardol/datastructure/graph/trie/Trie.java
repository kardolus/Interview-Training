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
        int i = 1;
        Node newNode;
        int index = charToIndex(word.charAt(0));
        char[] charArray = word.toCharArray();

        if(rootNodes[index] == null){
            rootNodes[index] = new Node(word.charAt(0));
        }

        focus = rootNodes[index];

        while (focus.nodeArray[charToIndex(charArray[i])] != null){
            focus = focus.nodeArray[charToIndex(charArray[i])];
            i++;
        }

        while(i < charArray.length){ // add the rest
            newNode = new Node(charArray[i]);
            index = charToIndex(charArray[i]);
            focus.nodeArray[index] = newNode;
            focus = focus.nodeArray[index];
            i++;
        }
    }

    public String complete(String word) {
        focus = traverseToFocus(word);
        String result = word;

        for(int i = 0; i < focus.nodeArray.length; i++) {
            if(focus.nodeArray[i] != null){
                focus = focus.nodeArray[i];
                i = 0;
                result += focus.toString();
            }
        }
        return result;
    }

    private Node traverseToFocus(String word){
        char[] charArray = word.toCharArray();
        int index = charToIndex(charArray[0]);
        focus = rootNodes[index];

        for(int i = 1; i < charArray.length; i++){
            index = charToIndex(charArray[i]);
            focus = focus.nodeArray[index];
        }

        return focus;
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
