import java.time.temporal.Temporal;

class Node {
    private String data;
    private Node next;

    public Node(String Data) {
        this.data = Data;
    }

    public void setNext(Node node) {
        this.next = node;

    }

    public String getData() {
        return this.data;

    }

    public void setData(String Data) {
        this.data = Data;

    }

    public Node getNext() {
        return this.next;
    }
}

class LinkedList {
    private Node Head;
    private Node Tail;

    public Node getHead() {
        return this.Head;
    }

    public Node getTail() {
        return this.Tail;
    }

    public void addAtEnd(String Data) {
        Node node = new Node(Data);
        /*
         * check if the list is empty if yes then just make this new node as Head as
         * well as Tail
         */
        if (this.Head == null) {
            this.Head = this.Tail = node;
        } else {
            this.Tail.setNext(node);
            this.Tail = node;

        }
    }

    public void addAtBegining(String Data) {
        Node node = new Node(Data);
        /*
         * check if the list is empty if yes then just make this new node as Head as
         * well as Tail
         */
        if (this.Head == null) {
            this.Head = this.Tail = node;
        } else {
            this.Head.setNext(node);
            this.Head = node;

        }
    }

    public void Display() {
        Node temp = this.Head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node Find(String Key) {
        Node temp = this.Head;
        while (temp != null) {
            if (temp.getData().equals(Key)) {
                return temp;

            }
            temp = temp.getNext();
        }
        return null;

    }

    public void insert(String data, String DataBefore)  {
        Node node = new Node(data);
        // check if the list is empty if yes then make the new node as
        if (this.Head == null) {
            this.Head = this.Tail = node;

        } else {
            Node nodeBefore = this.Find(DataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext()); //setting the node after the data before node as the next of the new node not that hard:)
                nodeBefore.setNext(node);
            }
            if (nodeBefore == this.Tail) {
                this.Tail = node;
            }
        }
    }

}

public class addElement {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addAtEnd("Magdum");
        l1.addAtEnd("Misbah");
        l1.addAtEnd("Humera");
        l1.addAtEnd("tausif");
        l1.insert("Matin", "Magdum");
        l1.Display();
    }

}
