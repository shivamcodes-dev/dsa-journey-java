package BinaryTree;

public class LowestCommonAccensterOpt {
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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftA = lca(root.left, n1, n2);
        Node rightA = lca(root.right, n1, n2);
        if (leftA == null) {
            return rightA;
        }
        if (rightA == null) {
            return leftA;
        }
        return root;

    }

    public static void main(String[] args) {
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
        System.out.println(lca(root, 4, 6).data);
    }

}
