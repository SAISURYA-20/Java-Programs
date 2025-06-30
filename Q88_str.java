package day26;
import java.util.Scanner;
public class Q88_str {
	public static int printSumASCII(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum += (int)s.charAt(i);}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println(printSumASCII(name));
		sc.close();
	}

}
