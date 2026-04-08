package Linklist;

public class DublyLinklist {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void removeFirst() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void revese() {
        Node curr = head;
        Node prevN = null;
        Node nextN;
        while (curr != null) {
            nextN = curr.next;
            curr.next = prevN;
            curr.prev = nextN;
            prevN = curr;
            curr = nextN;
        }
        head = prevN;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DublyLinklist dll = new DublyLinklist();
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(1);
        dll.addFirst(2);
        // dll.addFirst(8);
        dll.addLast(4);
        dll.addLast(78);

        dll.print();
        dll.revese();
        dll.print();
    }
}
