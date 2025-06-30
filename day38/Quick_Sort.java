package day38;

public class Quick_Sort {
	static void Quick_sort(int arr[], int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			Quick_sort(arr,low,pivot-1);
		    Quick_sort(arr,pivot+1,high);
		}
	}
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		int arr[]= {64,25,12,22,11};
		int n=arr.length;
		Quick_sort(arr, 0, n-1);
		System.out.println("Sorted Quick= ");
		for(int value: arr) {
			System.out.print(value+"=value, ");
			
		}
	}

}
