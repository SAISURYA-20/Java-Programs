package day13;

public class Q38_sumofdigits {
	static int sumOfDigits(int n) {
		int ans=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			ans=ans+r;
			System.out.println(ans);
		}
		return n;
	}
	public static void main(String[] args) {
				sumOfDigits(1234);									////int n=1234;
												/////System.out.println("sum of the digits:");
													///int ans=0;
														////while(n>0)
														///{
														///int r=n%10;
															//n=n/10;
																///ans= ans+r;
																			//}
																//System.out.println(ans);
	}

}
