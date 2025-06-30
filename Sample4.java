package samplesquestion;
import java.util.*;

public class Sample4{
    public static int changes(int[] arr) {
    	int n=arr.length;
    	int mid1,  mid2;
    	int changes=0;
    	if(n%2==0) {
    		mid1=n/2-1;
    		mid2=n/2;
    	}
    	else {
    		mid1=mid2=n/2;
    	}
    	for(int i=mid1-1;i>=0;i--) {
    		if(arr[i]!=arr[i+1]-1) {
    			arr[i]=arr[i+1]-1;
    		    changes++;
    		}
    	}
    	for(int i=mid2+1;i<n;i++) {
    		if(arr[i]!=arr[i-1]-1) {
    			arr[i]=arr[i-1]-1;
    			changes++;
    		}
    	}
    	return changes;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int[] L=new int[a];
        for(int i=0;i<a;i++) {
        	L[i]=sc.nextInt();
        }
        int r=changes(L);
        System.out.println(r);
		
	}
}


