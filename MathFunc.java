package day26;

public class MathFunc {
	public static void main(String[] args) {
		int a=5;
		int b=5;
		int c=Math.max(a,b);
		System.out.println(c);
		c=Math.min(a,b);
		System.out.println(c);
		c=(int)Math.pow(a, b);
		System.out.println(c);
		double c1=Math.sqrt(100);
		System.out.println((int)c1);
		c1=Math.random();
		System.out.println(c1);
		System.out.println("OTP = "+(int)(c1*1000));
	}

}
