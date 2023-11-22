package linkedlist;

public class MyLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void add(int value) {
        if (head == null) {
            Node node = new Node();
            node.setValue(value);
            head = node;
        }
        else {
            Node currentNode = head;
            while (head.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            Node node = new Node();
            node.setValue(value);
            currentNode.setNext(node);
            node.setLast(currentNode);
        }
    }
}
