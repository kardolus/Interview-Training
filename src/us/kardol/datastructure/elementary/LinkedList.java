package us.kardol.datastructure.elementary;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> focus;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        size++;
        if(head == null){
            head = new Node<>(element);
            return;
        }

        if(focus == null) {
            focus = head;
        }
        while(focus.next != null){
            focus = focus.next;
        }
        focus.next = new Node<>(element);
    }

    public int size() {
        return size;
    }

    public void remove(T element) {
        if(head == null){
            return;
        }
        if(head.data.equals(element)){
            head = head.next;
            size--;
            return;
        }

        focus = head;
        while(focus.next != null) {
            if (focus.next.data.equals(element)) {
                focus.next = focus.next.next;
                size--;
                return;
            }
            focus = focus.next;
        }
    }

    public void removeAll(T element) { // TODO refactor
        if(head == null){
            return;
        }
        if(head.data.equals(element)){
            head = head.next;
            size--;
            removeAll(element);
        }
    }

    public T peek(){
        return head.data;
    }

    public T pop(){
        if(head == null){
            return null;
        }
        T returnValue = head.data;
        head = head.next;
        size--;
        return returnValue;
    }

    public T peekFirst() {
        return peek();
    }

    public T peekLast() {
        if(head == null){
            return null;
        }
        if(focus == null) {
            focus = head;
        }
        while(focus.next != null){
            focus = focus.next;
        }
        return focus.data;
    }


    public T pull() {
        peekLast();
        T returnValue = focus.data;
        if(returnValue == null){
            return returnValue;
        }
        size--;
        focus = null;
        return returnValue;
    }
}

class Node<T>{
    Node next;
    T data;

    public Node(T data){
        this.data = data;
    }
}
