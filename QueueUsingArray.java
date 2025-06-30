package day31;
class MyQueue
{
	int size=5;
	int data[]=new int[size];
	int front=0;
	int rear=-1;
	boolean enqueue(int add) {
		if(rear==size-1) {
			System.out.println("Queue is full");
			return false;
		}
		else {
			rear++;
			data[rear]=add;
	}
	return true;
}
	int dequeue() {
		if(rear<front) {
			System.out.println("Queue is empty");
		return -111;}
		else {
			int add=data[front];
			front++;
			return add;
		}
	}
	void printQueue()
	{
		for(int k: data)
			System.out.println(k);
	}
	boolean isEmpty() {
		if(rear<=front) {
			return true;
	}
	return false;
}
	void printqueue() {
		for(int i=0;i<size;i++)
		System.out.println("FIFO:" +data[i]);
	}
}


public class QueueUsingArray {
	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.printqueue();
		int ans=queue.dequeue();
		System.out.println(ans);
		
		
		
	}

}
