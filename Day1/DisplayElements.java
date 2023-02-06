/*
 * Adding the element in the linked list at the End and even at the begingning  😉 
 * traversing in the linked list and displaying the elements 
 *  
 * 
 * (: output :)
 * Hello 
 * Magdum 
 * Pirjade                                                                                                                                                                hello 
 * 
 */


class Node {
    private String Data;
    private Node Next;

    public Node(String data) {
        this.Data = data;
    }

    public String getData() {
        return this.Data;
    }

    public void setNext(Node node) {
        this.Next = node;
    }

    public Node getNext() {
        return this.Next;
    }
}

class LinkedList {
    private Node head;
    private Node Tail;

    public Node getHead() {
        return this.head;

    }

    public Node getTail() {
        return this.Tail;
    }

    public void addAtEnd(String data) {
        Node node = new Node(data);
        /*
         * check if the list is empty if yes then assign the node as head and tail  
         */
        if (this.head == null) {
            this.head = this.Tail = node;
        } else {
            this.Tail.setNext(node);
            this.Tail = node;
        }
    }

    public void addAtBegining(String data) {
        Node node = new Node(data);
        /*
         * check if the list is empty if yes make the node as head and also tail. 
         * 
         */
        if (this.head == null) {
            this.head = this.Tail = node;

        } 
        /*
         * if the list is not empty , add the element at the begining
         */
        else {
            this.head.setNext(node);
            /*
             * Make the new node as head 
             */
            this.head = node;
        }

    }

    public void Display() {
        Node Temp = this.head;
        /*
         * Traverse the list until the reference temprory variable is not null 
         */
        while (Temp != null) {
            System.out.println(Temp.getData());
            Temp = Temp.getNext();
        }
    }
}

public class DisplayElements {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd("hello ");
        list.addAtEnd("Magdum ");
        list.addAtEnd("Pirjade");
        list.Display();

    }
}
