package day1;

import java.util.Scanner;

public class Pythagoren {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		pythagorentriple(a,b,c);
	}
	public static void pythagorentriple(int a, int b, int c) {
		int p=a*a;
		int q=b*b;
		int r=c*c;
		if(p+q==r) {
			System.out.println(a + " " + b + " and " + c + " are pythagoen Triples");
		}
		else
			System.out.println(a + " " + b + " and " + c + " are not pythagoen Triples");
	}

}
