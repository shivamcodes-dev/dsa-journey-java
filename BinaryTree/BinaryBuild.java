package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryBuild {

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

    static class Binarytree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newnNode = new Node(node[idx]);
            newnNode.left = buildTree(node);
            newnNode.right = buildTree(node);

            return newnNode;

        }

        public static void preOrder(Node head) {
            if (head == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(head.data + " ");
            preOrder(head.left);
            preOrder(head.right);
        }

        public static void inOrder(Node head) {
            if (head == null) {
                return;
            }
            inOrder(head.left);
            System.out.print(head.data + " ");// 3
            inOrder(head.right);

        }

        public static void postOrder(Node head) {
            if (head == null) {
                return;
            }
            inOrder(head.left);

            inOrder(head.right);
            System.out.print(head.data + " ");

        }

        public static int countOfNode(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCnt = countOfNode(root.left);
            int rightcnt = countOfNode(root.right);
            return leftCnt + rightcnt + 1;
        }

    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.levelOrder(root);
        // System.out.println(tree.heightOfTree(root));
        System.out.println(tree.countOfNode(root));

    }
}
