package day12;

public class Equation {
	static int findValue(int a,int b) {
		int c=0;
		c=c+a*a*a;
		c=c+3*a*a*b;
		c=c+3*a*b*b;
		c=c+b*b*b;
		return c;                   ///c=c+(a+b)*(a+b)*(a+b)
		
	}
	public static void main(String[] args) {
		int ans=findValue(2,2);
		System.out.println(ans);
		
	}

}
