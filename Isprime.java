package day11;

public class Isprime {
	static boolean isprime(int n)
	{
		int flag=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0) 
			 flag++;
		 }
		 if(flag==2)
			 return true;
		 else 
			 return false;
			 
	 }
		 
	public static void main(String[] args) {
		boolean ans=isprime(2);
		System.out.println(ans);
		ans=isprime(7);
		System.out.println(ans);
		ans=isprime(15);
		System.out.println(ans);
		ans=isprime(27);
		System.out.println(ans);
	}

}
