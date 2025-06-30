package day15;

public class Binarysearch {
   static 	int binarysearch(int a[],int x) {
	   int mid=0;
	   int left=0;
	   int right=a.length-1;
	   while(left<=right)
	   {
		   mid=(left+right)/2;
		   if(a[mid]==x)
		   {
			   return mid;
		   }
		   if(a[mid]<x) {
			   left=mid+1;
		   }
		   else {
			   right=mid-1;
		   }
	   }
	   return -1;
   }

	public static void main(String[] args) {
		int ans=binarysearch(new int[] {22,44,55,66,77},55);
		if(ans==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("found");
		System.out.println("Position"+ans);
		}
		ans=binarysearch(new int[] {1,2,3,4,5,6,7},6);
		if(ans==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("found");
		System.out.println("Position:"+ans);
		}

	}

}
