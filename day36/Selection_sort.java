package day36;

public class Selection_sort {
	public static void printSelectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			
		int temp=arr[min_index];
		arr[min_index]=arr[i];
		arr[i]=temp;
		}
		for(int m:arr) {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		int arr[]= {64,25,12,22,11};
		printSelectionSort(arr);
	}

}
