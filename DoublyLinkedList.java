package day31;

//CustomNode class represents each element in the list
class CustomNode {
 int data;
 CustomNode prev;
 CustomNode next;

 // Constructor
 CustomNode(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//CustomDoublyLinkedList class contains the linked list operations
class CustomDoublyLinkedList {
 CustomNode head;
 CustomNode tail;

 // Method to insert a new node at the end of the list
 public void insert(int data) {
     CustomNode newNode = new CustomNode(data);
     if (head == null) {
         head = newNode;
         tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Method to display the elements of the list from head to tail
 public void displayForward() {
     CustomNode temp = head;
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }

 // Method to display the elements of the list from tail to head
 public void displayBackward() {
     CustomNode temp = tail;
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.prev;
     }
     System.out.println("null");
 }

 // Method to delete a node with given key
 public void delete(int key) {
     CustomNode temp = head;

     // If head node itself holds the key to be deleted
     if (temp != null && temp.data == key) {
         head = temp.next; // Changed head
         if (head != null) {
             head.prev = null;
         } else {
             tail = null; // List is now empty
         }
         return;
     }

     // Search for the key to be deleted
     while (temp != null && temp.data != key) {
         temp = temp.next;
     }

     // If key was not present in the list
     if (temp == null) return;

     // Unlink the node from the list
     if (temp.next != null) {
         temp.next.prev = temp.prev;
     } else {
         tail = temp.prev; // If tail node is being deleted
     }

     if (temp.prev != null) {
         temp.prev.next = temp.next;
     }
 }

 public static void main(String[] args) {
     CustomDoublyLinkedList list = new CustomDoublyLinkedList();
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.displayForward(); // Output: 1 -> 2 -> 3 -> null
     list.displayBackward(); // Output: 3 -> 2 -> 1 -> null
     list.delete(2);
     list.displayForward(); // Output: 1 -> 3 -> null
     list.displayBackward(); // Output: 3 -> 1 -> null
 }
}
