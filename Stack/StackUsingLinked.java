package Stack;

public class StackUsingLinked {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int data = head.data;
            head = head.next;
            return data;
        }

        public static int peek() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(6);
        s.push(7);
        s.push(12);
        s.push(10);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
