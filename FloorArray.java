package day1;

public class FloorArray {
	public static int floorarr(int [] a,int n,int x) {
		if(x>=a[n-1]) {
			return n-1;
		}
		if(x<a[0]) {
			return -1;
		}
		for(int i=1;i<a.length;i++) {
			if(a[i]>x) {
				return i-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr=new int[] {1,2,8,10,10,12,19};
		int n=arr.length;
		int x=5;
		int index=floorarr(arr, n-1, x);
		if(index==-1) {
			System.out.println("floorarr " + x + " doesn't exit");
		}
		else {
			System.out.println("floorarr "+ x + " is " + arr[index]);
		}
	}

}
