package day1;
import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int nnn=sc.nextInt();
		if(isDigitDivisor(nnn))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static boolean isDigitDivisor(int nnn)
	{
		int t=nnn;
		while(t>0) {
			int digit=t%10;
		if(digit!=0 && nnn%digit!=0) {
			return false;
		}
		t/=10;
		}
		return true;
	}
}
