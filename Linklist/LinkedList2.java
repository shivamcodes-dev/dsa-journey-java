package Linklist;

public class LinkedList2 {
    public static void main(String[] args) {
        Node2 nn = new Node2(2);
        nn.addFirst(5);
        System.out.println(nn.head.data);
    }
}

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node2 head;
    public static Node2 tail;

    public void addFirst(int data) {
        // create new node
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // connect with node
        newNode.next = head;

        // new node ko head bana
        head = newNode;
    }
}
