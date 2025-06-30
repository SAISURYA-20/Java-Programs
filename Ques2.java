package day35;
import java.util.*;
public class Ques2 {
	public static void main(String[] args) {
		Queue<Integer>s1=new PriorityQueue<Integer>();
		s1.add(200);
		s1.add(400);
		int k=s1.remove();
		System.out.println("k=" +k);
	}

}
