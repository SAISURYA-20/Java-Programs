package day26;
class Node{
	int data;
	Node left,right;
	Node(int x){
		this.data=x;
		}
}
public class BinarySearchTree {
        static Node insert(int v, Node root) {
        	if(root==null) {
        		root=new Node(v);
        	}
        	else if(v<root.data) {
        		root.left=insert(v,root.left);
        	}
        	else 
        		root.right=insert(v,root.right);
        	return root;
        }
        static void inorder(Node root) {
        	if(root==null)
        	{        
        		return;
        	}
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        }
        static Node search(int v,Node root) {
        	if(root.data==v) {
        		return root;
        	}
        	else if(v<=root.data) {
        		return search(v,root.left);
        	}
        	else {
        	return search(v,root.right);
        }
        }
        public static void main(String[] args) {
        	Node root=null;
			root=insert(50,root);
			root=insert(15,root);
			root=insert(25,root);
			root=insert(80,root);
			inorder(root);
			
		}
       
}
