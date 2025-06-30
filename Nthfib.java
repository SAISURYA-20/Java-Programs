package day13;

public class Nthfib {
	static int fib(int n)
	{
		int a=1;
		int b=1;
		int c=1;
		n=n-2;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("1st fib ="+fib(1));
		System.out.println("2nd fib ="+fib(2));
		System.out.println("3rd fib ="+fib(3));
		System.out.println("4th fib ="+fib(4));
		System.out.println("5th fib ="+fib(5));
		
	}

}
