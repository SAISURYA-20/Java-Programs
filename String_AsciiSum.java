package day21;

public class String_AsciiSum {
	static int getAsciiSum(String input1)
	{
		int ans=0;
		for(int i=0;i<input1.length();i++)
		{
			ans=ans+input1.charAt(i);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		String s="sai";
		int sum=getAsciiSum(s);
		System.out.println(sum);
		
	}

}
