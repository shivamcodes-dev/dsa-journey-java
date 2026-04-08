public class test {
    public static class Node{
        int data;
        Node Next;
    public Node(int data){
        this.data = data;
        this.Next = null;
    }
    }
    private Node head;
    private Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.Next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.Next;
        }
        System.out.print("null");
    }

    public void addAtMiddle(int idx, int data){
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while (i<idx-1) {
            i++;
            temp =temp.Next;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;
    }
    
    public static void main(String[] args) {
        test ll = new test();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.print();
        ll.addAtMiddle(2, 4);
    }
}
