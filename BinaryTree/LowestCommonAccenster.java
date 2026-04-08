package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAccenster {
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

    public static Node lca(Node root, int m, int n) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, m, path1);
        treavese(root, n, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }

        return path2.get(i - 1);

    }

    public static boolean treavese(Node root, int m, ArrayList<Node> arr) {
        if (root == null) {
            return false;
        }
        arr.add(root);
        if (m == root.data) {
            return true;
        }

        boolean leftP = treavese(root.left, m, arr);
        boolean rigthP = treavese(root.right, m, arr);

        if (leftP || rigthP) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;

    }

    public static boolean getPath(Node root, int m, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == m) {
            return true;
        }
        boolean path1 = getPath(root.left, m, path);
        boolean path2 = getPath(root.right, m, path);
        if (path1 || path2) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int m = 4, n = 6;
        System.out.println(lca(root, m, n).data);

    }
}
