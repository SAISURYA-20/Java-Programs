package day21;

public class Stringhandlingmethods {
	public static void main(String[] args) {
		String s="India";
		char a[]=s.toCharArray();
	    for(int i=0;i<a.length;i++)
		System.out.println(s.charAt(i));
	    if(s.equals('a')||s.equals('e')||s.equals('i')||s.equals('o')||s.equals('u'))
	    System.out.println(s);
	}
	

}
