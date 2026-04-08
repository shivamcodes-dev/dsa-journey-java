package Linklist;

import java.util.LinkedList;

public class Ziczik {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void ziczag(Node head) {
        Node slow = head;
        Node fast = head.next;
        // finding mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node right = slow.next;
        slow.next = null;
        // reverse right
        Node prev = null;
        Node curr = right;
        Node nextptr;

        while (curr != null) {
            nextptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextptr;
        }
        Node left = head;
        right = prev;
        Node nextleft = left;
        Node nextrigth = right;

        while (left != null && right != null) {
            nextleft = left.next;
            left.next = right;
            nextrigth = right.next;
            right.next = nextleft;

            // updation
            left = nextleft;
            right = nextrigth;

        }

        // mearg them
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.addFirst(12);
    }
}
