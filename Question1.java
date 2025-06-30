package day1;
import java.util.*;
public class Question1 {
	public static int countpages(int n,int p) {
		int fromFront=p/2;
		int fromBack=(n/2)-(p/2);
		return Math.min(fromFront, fromBack);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		System.out.println(countpages(n,p));
	}

}
