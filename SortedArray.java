package day1;
public class SortedArray {
	public static void printarray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		
	}
	public static void printSorted(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		printarray(array);
	}
	public static void main(String[] args) {
		int [] arr=new int[] {-4,3,-2,1,-6,8,5};
		printSorted(arr);
	}

}
