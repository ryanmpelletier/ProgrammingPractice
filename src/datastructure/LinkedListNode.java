package datastructure;

public class LinkedListNode {

    public LinkedListNode next = null;
    public int data;

    public LinkedListNode(int d){
        this.data = d;
    }

    public void appendToTail(int d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    @Override
    public String toString(){
        LinkedListNode linkedListNode = this;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(linkedListNode.data);
        while(linkedListNode.next != null){
            linkedListNode = linkedListNode.next;
            stringBuilder.append(", ").append(linkedListNode.data);
        }
        return stringBuilder.toString();
    }


}
