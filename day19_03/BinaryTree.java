package day19_03;
class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	public void createTree() {
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left= new Node(4);
		root.left.left.right=new Node(8);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		root.right.left.left=new Node(9);
		root.right.left.right=new Node(10);
	}
	public void inorder(Node n) {
		if(n==null)
			return;
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
		
	}
	public void preorder(Node r) {
		if(r==null)
			return;
		System.out.print(r.data + " ");
		preorder(r.left);
		preorder(r.right);
	}
	public void postorder(Node t) {
		if(t==null)
			return;
		postorder(t.left);
		postorder(t.right);
		System.out.print(t.data + " ");
	}
	public static void main(String[] args) {
		BinaryTree obj=new BinaryTree();
		obj.createTree();
		System.out.println("Inorder travesal= ");
		obj.inorder(obj.root);
		System.out.println();
		System.out.println("Preorder Travesal= ");
		obj.preorder(obj.root);
		System.out.println();
		System.out.println("Postorder Travesal= ");
		obj.postorder(obj.root);
	}
	

}
