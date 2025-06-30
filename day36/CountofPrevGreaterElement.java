package day36;
import java.util.*;

public class CountofPrevGreaterElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,5,6,10,11};
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		System.out.println("Count= "+ count);
	}

}
