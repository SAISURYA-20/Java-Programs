package day39;

import java.util.Scanner;

public class StrongFactorial {
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static boolean isStrong(int n) {
		int fact=1;
		int a=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+(fact(digit));
			n=n/10;
		}
		return sum==a;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isStrong(n));
	}

}
