public class Ch2902 {
    static class Node {
    int data;
    Node right;
   Node left;

   public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public static int count (Node root){
      if (root == null) {
        return 0;
      }
      int leftcount = count(root.left);
      int rightcount = count(root.right);
      int treeCount = leftcount+rightcount+1;
      return treeCount;
    }

    public static int sumOfNode(Node root){
      if (root == null) {
        return 0;
      }
      int leftsum = sumOfNode(root.left);
      int rightsum = sumOfNode(root.right);
      int totalsum = leftsum + rightsum + root.data;
      return totalsum;
    }
  }


    public static boolean isIdentical(Node node, Node subroot){
      if (node == null && subroot == null ) {
        return true;
      }else if (node == null || subroot == null || node.data != subroot.data) {
        return false;
      }
      if (!isIdentical(node.left, subroot.left)) {
        return false;
      }
      if (!isIdentical(node.right, subroot.right)) {
        return false;
      }
      return true;
    }


    
    public static boolean isSubtree(Node root, Node subroot){
      if (root == null) {
        return false;
      }
      if (root.data == subroot.data) {
        if (isIdentical(root, subroot)) {
          return true;
        }
      }
      // isSubtree(root.left, subroot);
      // isSubtree(root.right, subroot);
      return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
     
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // // System.out.println(Node.count(root));
        // System.out.println(Node.sumOfNode(root));

        Node subNode = new Node(2);
        subNode.left = new Node(4);
        subNode.right = new Node(5);

        System.out.println(isSubtree(root, subNode));

    }
}