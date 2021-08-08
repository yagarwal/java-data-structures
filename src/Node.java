public class Node <T> {
    T value;
    Node next;

    Node(T value) {
        this.value = value;
    }

    Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    boolean hasNext() {
        return next != null;
    }

    void setValue(T value) {
        this.value = value;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getNext() {
        return next;
    }

    T getValue() {
        return value;
    }
}
