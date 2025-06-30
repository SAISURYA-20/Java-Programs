package day26;

import java.util.Scanner;

public class Arraysss {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		float a[]=new float[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextFloat();
		}
			System.out.println("Printing the values");
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
		
	}
