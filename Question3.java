package day1;
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people in the room:");
		int T=sc.nextInt();
		if(T<2)
		{
			System.out.println("Need 2 people for handshakes");
		}
		else {
			int handshakes=T*(T-1)/T;
			System.out.println("Handshakes:"+handshakes);
		}
	}

}
