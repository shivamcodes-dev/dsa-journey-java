public class Ch2602 {
    static class Node {
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            this.Next = null;
        }
    }
    static class Stack {
        static Node head = null;

        static boolean isEmpty(){
            return head == null;
        }
        
        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.Next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.Next;
            return top;
        }

        //peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
        
    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
