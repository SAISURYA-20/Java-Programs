package day35;
import java.util.LinkedList;
import java.util.Queue;

class treeNode {
    int val;
    treeNode left;
    treeNode right;

    treeNode(int val) {
        this.val = val;
    }
}

public class MaxWidthTree {

    public int maxWidth(treeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<treeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 
            maxWidth = Math.max(maxWidth, levelSize);

            for (int i = 0; i < levelSize; i++) {
                treeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        
        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);
        root.right.right = new treeNode(8);
        root.right.right.left = new treeNode(6);
        root.right.right.right = new treeNode(7);
        MaxWidthTree max = new MaxWidthTree();
        int maxWidth = max.maxWidth(root);

        
        System.out.println(maxWidth);
    }
}

