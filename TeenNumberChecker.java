package day1;

import java.util.Scanner;

public class TeenNumberChecker {
	public static boolean isteenchecker(int a, int b, int c) {
		if(a>=13 && a<=19)
			return false;
		else if(b>=13 && b<=19)
			return false;
		else if(c>=13 && c<=19)
			return false;
		else
			return true;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean res=isteenchecker(a, b, c);
		System.out.println(res);
		
		
	}

}
