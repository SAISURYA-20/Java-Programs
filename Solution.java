package day35;

class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int val) {
	        this.val = val;
	    }
	}

	public class Solution {
	    public void flatten(TreeNode root) {
	        if (root == null) return;

	        flatten(root.left);
	        flatten(root.right);

	        if (root.left != null) {
	            TreeNode rightSubtree = root.right;
	            root.right = root.left;
	            root.left = null;

	            TreeNode current = root.right;
	            while (current.right != null) {
	                current = current.right;
	            }
	            current.right = rightSubtree;
	        }
	    }
	        public static void main(String[] args) {
	            
	            TreeNode root = new TreeNode(1);
	            root.left = new TreeNode(2);
	            root.right = new TreeNode(5);
	            root.left.left = new TreeNode(3);
	            root.left.right = new TreeNode(4);
	            root.right.right = new TreeNode(6);

	            
	            Solution solution = new Solution();
	            solution.flatten(root);

	            // Print the linked list
	            TreeNode current = root;
	            while (current != null) {
	                System.out.print(current.val + " ");
	                current = current.right;
	            }
	}
			
}

