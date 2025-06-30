package day18_03;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingCollections {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(10);
		
		q1.add(20);
		int ans=q1.remove();
		System.out.println(ans);
		
	}

}
