package day37;
import java.util.*;

public class Capgemini_DealerShip {
	public static int findValue(int n,int[] a, int[] b) {
		int c=0;
		for(int i=0;i<n;i++)
		{
		 int totaltyres=(a[i]*4)+(b[i]*2); 
		 c+=totaltyres;
		}
		return c;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= {4,4,1};
		int b[]= {2,0,1};
		findValue(n,a,b);
	} 

}
