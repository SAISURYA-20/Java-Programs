package day21;

public class PalindromeString {
	public static void main(String[] args) {
		String s1="madam";
		String r="";
		for(int i=0;i<s1.length();i++)
		{
			r=s1.charAt(i)+r;
			
		}
		System.out.println("r="+r);
		if(r.equals(s1)) {
			System.out.println("yes it is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
