package day37;
import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int [] arr= {53,6,4,5,2};
    	int rotate=sc.nextInt();
    	for(int i=0;i<rotate;i++) {
    		int temp=arr[arr.length-1];
    		for(int j=arr.length-1;j>0;j--) {
    			arr[j]=arr[j-1];
    		}
    		arr[0]=temp;   		
    	}
    	for(int num:arr) {
         System.out.print(num + " ");
    	}
    }
        
}

