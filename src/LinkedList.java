public class LinkedList <T> {
    private Node<T> first;
    private Node<T> last;

    LinkedList() {}

    void addFirst(T value) {
        Node node = new Node<T>(value);
        if (first == null) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    void addLast(T value) {
        Node node = new Node<T>(value);
        if (last == null) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }

    }

    void removeFirst() {
        try {
            if (first == null) {
                throw new IllegalAccessError("Linked List contains 0 elements");
            }
            Node second = first.getNext();
            first.setNext(null);
            first = second;
        } catch (IllegalAccessError e) {
            throw e;
        }
    }

    void removeLast() {
        Node node = first;
        Node secondLast = first;
        while (node.hasNext()) {
            secondLast = node;
            node = node.getNext();
        }
        secondLast.setNext(null);
        last = secondLast;
    };

    boolean contains(T value) {
        Node node = first;
        boolean doesContain = false;
        while (node != null)
        {
            if (node.getValue() == value) {
                doesContain = true;
                break;
            }
            node = node.getNext();
        }
        return doesContain;
    };

}
