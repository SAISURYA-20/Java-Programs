package day31;

//Node class represents each element in the list
class Node {
 int data;
 Node next;

 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//SinglyLinkedList class contains the linked list operations
class SinglyLinkedList {
 Node head;

 // Method to insert a new node at the end of the list
 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
 }

 // Method to display the elements of the list
 public void display() {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }

 // Method to delete a node with given key
 public void delete(int key) {
     Node temp = head;
     Node prev = null;

     // If head node itself holds the key to be deleted
     if (temp != null && temp.data == key) {
         head = temp.next; // Changed head
         return;
     }

     // Search for the key to be deleted, keep track of the previous node
     while (temp != null && temp.data != key) {
         prev = temp;
         temp = temp.next;
     }

     // If key was not present in the list
     if (temp == null) return;

     // Unlink the node from the linked list
     prev.next = temp.next;
 }

 public static void main(String[] args) {
     SinglyLinkedList list = new SinglyLinkedList();
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.display(); // Output: 1 -> 2 -> 3 -> null
     list.delete(2);
     list.display(); // Output: 1 -> 3 -> null
 }
}
