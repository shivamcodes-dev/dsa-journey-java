package Linklist;

public class LinkedList {

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

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // connect with node
        newNode.next = head;

        // new node ko head bana
        head = newNode;
    }

    public void addLast(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // add at last
        tail.next = newNode;

        // newnode ko tail bana
        tail = newNode;
    }

    public void printLinkList() {

        if (head == null) {
            System.out.println("Empty LinkList");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void addInMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;

            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int itrSearch(int key) {

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int recurivSearch(int key, int i, Node temp) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return i;
        }

        temp = temp.next;
        i++;
        return recurivSearch(key, i, temp);
    }

    public static void reverseLinklist() {

        Node prev = null;
        Node curr = tail = head;
        Node nextNode;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    public static void deleteNthFromEnd(Node head, int n) {
        int idx = size - n;
        Node prev = head;
        int i = 1;
        if (n == size) {
            head = head.next;
            return;
        }
        while (i < idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean chackPalidram(Node head) {
        // coner case
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node mid = findMid(head);

        // reverse from mid
        Node prev = null;
        Node curr = mid;
        Node nextn;
        while (curr != null) {
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
        }
        Node right = prev; // right half head
        Node left = head;

        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {

        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // +1 se bdha
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static Node meargeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // devide into two
        Node righthead = slow.next;
        slow.next = null;
        Node left = meargeSort(head);
        Node right = meargeSort(righthead);

        // mearge
        return merge(left, right);
    }

    public static Node merge(Node left, Node right) {
        Node meargll = new Node(-1);
        Node temp = meargll;
        Node leftptr = left;
        Node rightptr = right;
        while (leftptr != null && rightptr != null) {
            if (leftptr.data <= rightptr.data) {
                temp.next = leftptr;
                leftptr = leftptr.next;
                temp = temp.next;
            } else {
                temp.next = rightptr;
                rightptr = rightptr.next;
                temp = temp.next;
            }
        }
        while (leftptr != null) {
            temp.next = leftptr;
            temp = temp.next;
            leftptr = leftptr.next;
        }
        while (rightptr != null) {
            temp.next = rightptr;
            temp = temp.next;
            rightptr = rightptr.next;
        }

        return meargll.next;
    }

    public static void ziczag() {
        Node slow = head;
        Node fast = head.next;

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
        LinkedList ll = new LinkedList();
        // ll.addFirst(5);
        // ll.addFirst(82);
        // ll.addFirst(7);
        // ll.addLast(63);
        // ll.addLast(45);
        // ll.printLinkList();
        // ll.addInMiddle(2, 72);

        // ll.printLinkList();
        // System.out.println(ll.size);

        // Node hi = new Node(5);
        // System.out.println(hi);
        // System.out.println(hi.data);
        // ll.printLinkList();
        // System.out.println(ll.itrSearch(415));
        // System.out.println(recurivSearch(8, 0, head));
        // ll.reverseLinklist();
        // ll.printLinkList();
        // ll.deleteNthFromEnd(head, 2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(68);
        ll.addLast(5);

        // ll.printLinkList();
        // System.out.println(ll.chackPalidram(head));

        // head = new Node(5);
        // Node temp = new Node(3);
        // head.next = temp;
        // head.next.next = new Node(8);
        // head.next.next.next = temp;
        // // System.out.println(ll.isCycle(head));
        // System.out.println(ll.isCycle(head));
        // ll.removeCycle();
        // ll.printLinkList();
        // System.out.println(ll.isCycle(head));
        ll.printLinkList();
        // head = ll.meargeSort(head);
        ll.ziczag();
        ll.printLinkList();
    }
}
