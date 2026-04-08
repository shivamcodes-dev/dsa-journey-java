package BinaryTree;

public class HeightTree {
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

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        int height = Math.max(left, right) + 1;
        return height;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
