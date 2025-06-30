package day37;
import java.util.*;
public class Series {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tn=0;
		if(n%2!=0)
		{
			tn=7*(n/2);
		}
		else
			tn=6*((n/2)-1);
			System.out.println(tn);
	}

}
