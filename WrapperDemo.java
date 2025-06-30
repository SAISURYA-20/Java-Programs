package day10;

public class WrapperDemo {
public static void main(String[] args) {
	String s1="4";
	int k=Integer.parseInt(s1);
	System.out.println(k*k);
	String ans1=Integer.toBinaryString(k*k);
	String ans2=Integer.toHexString(k*k);
	String ans3=Integer.toOctalString(k*k);
	System.out.println(ans1);
	System.out.println(ans2);
	System.out.println(ans3);
}
}
