package in.DLL.dsa;

public class Node {
    int data;
    Node next;
    Node prev;

    // Constructor 1
    public Node(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }

    // Constructor 2 (with previous node)
    public Node(int val, Node prev) {
        this.data = val;
        this.next = null;
        this.prev = prev;
    }

    // Constructor 3 (with both next and prev)
    public Node(int val, Node next, Node prev) {
        this.data = val;
        this.next = next;
        this.prev = prev;
    }
}

