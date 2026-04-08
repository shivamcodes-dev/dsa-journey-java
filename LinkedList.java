public class LinkedList {
    public static class Node {
        int data;
        Node Next;    

        public Node(int data){
            this.data = data;
            this.Next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    /*or ek baat (agar a.Next = __ aata hai to matlab a ke Next me address aayega)
     aur agar equl to ke baad .next aaye ga to agale node ko point karega;
     */

    public void addFirst(int data){
        Node obj = new Node(data);
        size++;
        if (head == null) {
            head = tail = obj;
            return;
        
        }
        obj.Next = head;
        head = obj; 

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1) {
            temp = temp.Next;
            i++;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;

    }

    public void printLink(){
        Node temp = head;
        while (temp != null) {
            
        System.out.print(temp.data + "->");
        temp = temp.Next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int removeFirst(){
        if (size == 0) {
            System.out.println("LinkedList is empty:)");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.Next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0) {
            System.out.println("LinkList is empty :)");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.Next;
        }
        int val = prev.Next.data;
        prev.Next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        int idx = 0;
        Node temp = head;
        while(temp != null) {
            if (temp.data == key) {
                return idx;
            }else{
                temp = temp.Next;
                idx++;
            }
        }
         return -1;
    }

    public int healper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = healper(head.Next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int SearchByRecursion(int key){
        return healper(head, key);
    }

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;// next is the temprory variable but .Next is the address

        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void removeNthNode(int backidx){
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.Next;
            sz++;
        }

        if (sz == backidx) {
            head = head.Next;
            return;
        }
        int i = 1;
        int iTofind = sz-backidx;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.Next;
            i++;
        }
        prev.Next = prev.Next.Next;
        return;
    }


    public Node findMid(Node head){ //healper for palindrom
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            fast = fast.Next.Next;
            slow = slow.Next;
        }
        return slow;
    }


    public boolean isPalindrome(){
        if (head == null || head.Next == null) {
            return true;
        }
        //find middle
        Node midNode = findMid(head);


        // reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        } 
            Node right = prev;
            Node left = head;

        //cheack left or right half
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.Next;
            left = left.Next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null ) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.Next;
            fast = fast.Next;
        } 

        //remove cycle -> last.next = null
        prev.Next = null;

    }

    public static Node getmid(Node head){
        Node slow = head;
        Node fast = head.Next;

        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
         if (head1.data <= head2.data) {
            temp.Next = head1;
            head1 = head1.Next;
            temp = temp.Next;
          } else{
            temp.Next = head2;
            head2 = head2.Next;
            temp = temp.Next;
          }
        }

        while (head1 != null) {
            temp.Next = head1;
            head1 = head1.Next;
            temp = temp.Next;
        }
        while (head2 != null) {
            temp.Next = head2;
            head2 = head2.Next;
            temp = temp.Next;
        }
        return mergedLL.Next;
    }
    


    public static Node mergeSort(Node head){
        //base case
        if (head == null || head.Next == null) {
            return head;
        }

        //find mide
        Node mid = getmid(head);
        //left & right Measgsort
        Node righthead = mid.Next;
        mid.Next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);

        // mearg
        return merge(newleft, newright);
    }

    public void zicZak(){
        //find mid\
        Node mid = getmid(head);

        
        // reverse a righthead
        Node curr = mid.Next; // mean store the right half
        mid.Next = null; // break the list
        Node prev = null;
        Node next; // it is just a variable not the address of 
        while (curr != null) {
           next = curr.Next;
           curr.Next = prev;
           prev = curr;
           curr = next;
        }
        Node leftH = head;
        Node rightH = prev;
        Node nextL, nextR; // this is for store the next address of variable
        // now combine both
        while (leftH != null && rightH != null) {
        nextL = leftH.Next;
        leftH.Next = rightH;//
        nextR = rightH.Next;
        // leftH = leftH.Next // rightH = rightH.Next  we can not write this because alredy update
        rightH.Next = nextL;

        //update
        rightH = nextR;
        leftH = nextL;
        

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        // ll.printLink();
        // ll.addMiddle(3, 4);
        ll.printLink();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLink(); 
        // ll.removeLast();
        // ll.printLink();
        // System.out.println(ll.size);
        // System.out.println(ll.SearchByRecursion(13));
        // ll.reverseLinkedList();
        // ll.removeNthNode(3);
        // System.out.println(ll.isPalindrome());

        // head = new Node(1);
        // head.Next = new Node(2);
        // head.Next.Next = new Node(3);
        // head.Next.Next.Next = head;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        ll.printLink();
        // ll.head = ll.mergeSort(ll.head);
        ll.zicZak();
        ll.printLink();
        
        



        
        }
    
}
