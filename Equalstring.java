package day21;

public class Equalstring {
	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO";
		boolean b1=s1.equals(s2);
		System.out.println("b1:"+b1);
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		int ans=s1.compareTo(s2);
		System.out.println(ans);
	}

}
