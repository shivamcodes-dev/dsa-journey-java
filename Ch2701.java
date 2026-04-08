public class Ch2701 {
    static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.Next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int val = head.data;
            // for single ele
            if (head == tail) {
                tail = head = null;
            } else {
                head = head.Next;
            }
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(12);
        q.add(10);
        q.add(8);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
