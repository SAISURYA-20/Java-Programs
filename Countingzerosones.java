package day26;

public class Countingzerosones {
	static void sort(int arr[]) {
		int n=arr.length;
		int c0=0;
		int c1=0;
		int c2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				c0+=1;
			}
			else if(arr[i]==1) {
				c1+=1;
			}
			else {
				c2+=1;
			}
		}
		int idx=0;
		for(int i=0;i<c0;i++) 
			arr[idx++]=0;
		
		for(int i=0;i<c1;i++) 
			arr[idx++]=1;
		
		for(int i=0;i<c2;i++) 
			arr[idx++]=2;
		
	}
	public static void main(String[] args) {
		int[] a= {0,1,2,0,1,2};
		int n=a.length;
		sort(a);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
