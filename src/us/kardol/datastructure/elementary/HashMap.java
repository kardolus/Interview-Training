package us.kardol.datastructure.elementary;

import java.util.*;
import java.util.ArrayList;
import java.util.Set;

public class HashMap { // array of linkedLists. Array indexes represent node hashcode values
    private int size = 0;
    private HashNode focus;
    private HashNode[] nodeArray = new HashNode[2]; // Simple hashcode returns 0 or 1

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void put(String key, String value) {
        HashNode node = new HashNode(key, value);
        int hashCode = node.hashCode();

        if(nodeArray[hashCode] == null){
            nodeArray[hashCode] = node;
            size++;
        }else{
            focus = nodeArray[hashCode];
            if(overWrite(focus, key, value)){
                return;
            }
            while(focus.next != null){
                focus = focus.next;
                if(overWrite(focus, key, value)){
                    return;
                }
            }
            focus.next = node;
            size++;
        }
    }

    private boolean overWrite(HashNode node, String key, String value){
        if(node.key.equals(key)){
            node.value = value;
            return true;
        }
        return false;
    }

    public String get(String key) {
        int hashCode = new HashNode(key, null).hashCode();
        focus = nodeArray[hashCode];
        while(focus != null){
            if(focus.key.equals(key)){
                return focus.value;
            }
            focus = focus.next;
        }
        return null;
    }

    public Set<String> keySet() {
        Set<String> result = new HashSet<>();
        for(int i = 0; i < nodeArray.length; i++){
            focus = nodeArray[i];
            while(focus != null){
                result.add(focus.key);
                focus = focus.next;
            }
        }
        return result;
    }

    public List<String> values() {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < nodeArray.length; i++){
            focus = nodeArray[i];
            while(focus != null){
                result.add(focus.value);
                focus = focus.next;
            }
        }
        return result;
    }

    public void remove(String key) {
        int hashCode = new HashNode(key, null).hashCode();

        if(nodeArray[hashCode].key.equals(key)){
            nodeArray[hashCode] = nodeArray[hashCode].next;
            size--;
            return;
        }

        focus = nodeArray[hashCode];
        while(focus.next != null){
            if(focus.next.key.equals(key)){
                focus.next = focus.next.next;
                size--;
                return;
            }
            focus = focus.next;
        }
    }

    public boolean containsKey(String key) {
        return get(key) != null;
    }
}

class HashNode{
    HashNode next;
    String key, value;

    public HashNode(String key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode(){
        return key.contains("a") ? 0 : 1;
    }
}
