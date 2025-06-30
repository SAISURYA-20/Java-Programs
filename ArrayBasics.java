package day26;

import java.util.Arrays;

public class ArrayBasics {
	public static void main(String[] args) {
		int a[] =new int[3];
		Arrays.fill(a, 100);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		int k=Arrays.binarySearch(a,100);
		System.out.println(k);
		if(k<0) {
			System.out.println("not found");
		}else 
			System.out.println("found");
		
		
	}

}
