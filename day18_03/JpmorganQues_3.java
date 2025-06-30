package day18_03;
import java.util.*;
import java.util.ArrayList;
public class JpmorganQues_3 {
	static boolean isValid(int x) {
		String s=Integer.toBinaryString(x);
		return !s.contains("11");
	}
	static void Nthpossible(int x) {
		ArrayList<String> z=new ArrayList<>();
		int num=1;
		while(z.size()<x) {
			if(isValid(num)) {
				z.add(Integer.toBinaryString(num));
			}
			num++;
		}
		for(int i=0;i<x;i++)
		   System.out.print(z.get(i) + " ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//while(n-->0) {
			Nthpossible(n);
		//}
		
	}
	

}
