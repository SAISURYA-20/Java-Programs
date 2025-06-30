package day18_03;

import java.util.Scanner;

public class JpmorganQues_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findNthnumber(n));
		
	}
	public static int findNthnumber(int n) {
		int count=0;
		int current=2;
		while(true) {
			if(current%10==2) {
				count++;
				if(count==n)
					return current;
			}
			current += 10;
		}
	}

}
