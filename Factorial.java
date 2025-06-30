package day11;

public class Factorial {
	
		static long factorial(int n)
		{
		    long  ans=1;
			for(int i=1;i<=n;i++)
				ans =ans*i;
			return ans;
		}
		public static void main(String[] args) {
			long result=factorial(5);
			System.out.println("5 ! = "+result);
			 result=factorial(6);
			System.out.println("6 ! ="+result);
			result=factorial(7);
			System.out.println("7 ! ="+result);
			result=factorial(10);
			System.out.println("10 ! ="+result);
			result=factorial(20);
			System.out.println("20 ! ="+result);
			
			
		}
}


