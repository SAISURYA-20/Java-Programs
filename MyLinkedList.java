package day32;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class MyLinkedList {
	public Node insertAtPos(int key,int pos, Node head) {
		Node temp=new Node(key);
		if(pos==1) {
			temp.next=head;
			head=temp;
		}
		else {
			Node temp1=head;
			for(int i=1;temp1!=null && i<pos-1;i++ )
				temp1=temp1.next;
			if(temp1==null) {
				System.out.println("out of bounds");
				return head;
			}
			temp.next=temp1.next;
			temp1.next=temp;	
		}
		return head;
	}
		public void printlist(Node head)
		{
			Node temp=head;
			int c=0;
			while(temp!=null) {
				System.out.print(temp.data + " ");
				temp=temp.next;
				c++;
			}
			System.out.println("number of nodes= "+ c);
		}
		public Node delAtPos(int pos,Node head) {
			if(pos==1) {
				head=head.next;
			}
			else {
				Node temp1=head;
				Node prev=null;
				for(int i=1;temp1!=null&&i<pos;i++) {
					prev=temp1;
					temp1=temp1.next;
				}
				prev.next=temp1.next;
			}
			return head;
		}
		public static void main(String[] args) {
			MyLinkedList list=new MyLinkedList();
			Node head=null;
			System.out.println("Inserting 10 at position 1: ");
			head=list.insertAtPos(10, 1, head);
			list.printlist(head);
			System.out.println("Inserting 20 at position 2: ");
			head=list.insertAtPos(20, 2, head);
			list.printlist(head);
			System.out.println("Inserting 30 at position 3: ");
			head=list.insertAtPos(30, 3, head);
			list.printlist(head);
			System.out.println("Inserting 40 at position 10: ");
			head=list.insertAtPos(40, 10, head);
			list.printlist(head);
			System.out.println("Inserting 5 at position 1: ");
			head=list.insertAtPos(5, 1, head);
			list.printlist(head);
			System.out.println("delete 30 at postion 4: " );
			head=list.delAtPos(4, head);
			list.printlist(head);
		}

}
