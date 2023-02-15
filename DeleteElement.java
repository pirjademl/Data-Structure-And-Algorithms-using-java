class Node {
    private String Data;
    private Node next;

    public Node(String data) {
        this.Data = data;

    }

    public String getData() {
        return this.Data;

    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node node) {
        this.next = node;

    }

}

class LinkedList {
    private Node Head;
    private Node Tail;

    /**
     * @return the head
     */
    public Node getHead() {
        return Head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return Tail;
    }

    public void addAtEnd(String data) {
        Node node = new Node(data);
        /*
         * check if the List is empty if yes then make the new node as the head and also
         * the tail of the list
         */
        if (this.Head == null) {
            this.Head = this.Tail = node;

        } else {
            this.Tail.setNext(node);
            this.Tail = node;

        }
    }

    public void addAtBegining(String data) {
        Node node = new Node(data);
        if (this.Head == null) {
            this.Head = this.Tail = node;
        } else {
            this.Head.setNext(node);
            this.Head = node;
        }
    }

    public void display() {
        Node temp = this.Head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node find(String key) {
        Node temp = this.Head;
        while (temp != null) {
            if (temp.getData().equals(key)) {
                return temp;

            } else {
                temp = temp.getNext();
            }
        }
        return null;

    }

    public void insert(String Data, String dataBefore) {
        Node node = new Node(Data);
        if (this.Head == null) {
            this.Head = this.Tail = node;

        } else {
            Node nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext());
            }
            // if the nodeBefore is the tail node of the list
            if (node == this.Tail) {
                this.Tail = node;
            }

        }
    }

    public int findPosition(String key) {
        Node temp = this.Head;
        int count = 1; // to count the position
        while (temp != null) {
            if (temp.getData().equals(key)) {
                return count;

            } else {
                // update the temp node with the next data
                temp = temp.getNext();
                count++;

            }

        }
        return 0;
    }

    public void delete(String key) {
        Node node = new Node(key);
        // check if the list is empty
        if (this.Head == null) {
            System.out.println("List is empty ");
        }

        else {
            Node toBeDeleteNode = this.find(key);
            if (toBeDeleteNode == null) {
                System.out.println("node not found ");
            }

            else if (toBeDeleteNode == this.Head) {
                this.Head = Head.getNext();
                node.setNext(null);

            }
            // if the node is the tail then assign the tail as null
            if (toBeDeleteNode == this.Tail) {
                this.Tail = null;

            }
            // if all the above conditions are false then
            else {
                Node nodeBefore = null;
                Node temp = this.Head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;

                    }
                    temp = temp.getNext();
                    // Remove the node

                }
                nodeBefore.setNext(node.getNext());

                // if the node to be deleted is the tail of the list then make the previos node
                // as next node
                if (node == this.Tail) {
                    this.Tail = nodeBefore;
                    node.setNext(null);
                }

            }
        }
    }
}

public class DeleteElement {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAtEnd("Pune");
        list.addAtEnd("Nagpur");
        list.addAtEnd("Surat");
        list.addAtEnd("Lucknow");
        list.addAtEnd("Agra");
        list.addAtEnd("Hyderabaad");
        list.display();
        System.out.println("--------------------------");
        list.delete("Surat");
        list.display();

       

    }

}