package LinkedList;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    LinkedListNode(){
        data = 0;
        next = null;
    }

    public LinkedListNode(int data){
        this.data = data;
    }

    LinkedListNode(int data, LinkedListNode next){
        this.data = data;
        this.next = next;
    }
}
