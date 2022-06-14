public class Node {
    int value;
    Node Next;
    public Node(int value, Node next) {
        this.value = value;
        Next = next;
    }

    public void setNext(Node next) {
        Next = next;
    }
    public Node getNext() {
        return Next;
    }
}
