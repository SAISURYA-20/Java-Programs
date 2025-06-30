package day35;
 class TreeNodes {
 int val;
 TreeNodes left;
 TreeNodes right;

 TreeNodes(int val) {
     this.val = val;
 }
}
public class solutions {
 public boolean isChildrenSumProperty(TreeNodes node) {
     if (node == null || (node.left == null && node.right == null)) {
         return true;
     }
     int leftVal = node.left != null ? node.left.val : 0;
     int rightVal = node.right != null ? node.right.val : 0;
     if (node.val == leftVal + rightVal) {
         return isChildrenSumProperty(node.left) && isChildrenSumProperty(node.right);
     }
     return false;
 }


 public static void main(String[] args) {
     // Creating a binary tree
     TreeNodes root = new TreeNodes(10);
     root.left = new TreeNodes(5);
     root.right = new TreeNodes(5);
     root.left.left = new TreeNodes(2);
     root.left.right = new TreeNodes(3);
     root.right.left = new TreeNodes(2);
     root.right.right = new TreeNodes(3);


     solutions solution = new solutions();
     boolean result = solution.isChildrenSumProperty(root);

     System.out.println(result);
 }
}
