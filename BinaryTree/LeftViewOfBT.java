package BinaryTree;

import java.util.*;
import java.util.Queue;

public class LeftViewOfBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int n = q.size();

            for (int i = 1; i <= n; i++) {
                Node temp = q.remove();
                if (i == 1) {
                    arr.add(temp.data);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        // List<String> list = new ArrayList<>();
        // getans("", list, 1);
        // System.out.println(list);
        /*
         * --1
         * /--\
         * 2-----3
         * / \ --/ \
         * 4 5--- 6- 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(leftView(root));
    }
}
