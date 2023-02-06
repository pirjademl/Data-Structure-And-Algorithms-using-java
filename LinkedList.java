// package Day2;

import org.w3c.dom.Node;

public class LinkedList {
    private Node Head;
    private Node Tail;

    public Node getHead() {
        return this.Head;

    }

    public Node getTail() {
        return this.Tail;

    }

    public static void main(String[] args) {
        LinkedList ld = new LinkedList();
        Node Head = ld.getHead();
        System.out.println(Head);
    }
}
