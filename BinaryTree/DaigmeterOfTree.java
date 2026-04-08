package BinaryTree;

public class DaigmeterOfTree {
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

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameterOfTree(root.left);
        int leftH = heightOfTree(root.left);
        int righthDiam = diameterOfTree(root.right);
        int rightH = heightOfTree(root.right);

        int selfDaim = leftH + rightH + 1;
        return Math.max(selfDaim, Math.max(righthDiam, leftDiam));
    }

    static class Info {
        int daim;
        int heigh;

        Info(int daim, int heigh) {
            this.daim = daim;
            this.heigh = heigh;
        }
    }

    public static Info optDaimeterOfTree(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftDaim = optDaimeterOfTree(root.left);
        Info rightDaim = optDaimeterOfTree(root.right);

        int height = Math.max(leftDaim.heigh, rightDaim.heigh) + 1;
        int selfDaim = leftDaim.heigh + rightDaim.heigh + 1;
        return new Info(Math.max(Math.max(leftDaim.daim, rightDaim.daim), selfDaim), height);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // Info n = new Info(0, 0);
        Info k = optDaimeterOfTree(root);
        System.out.println(k.daim);
    }
}
