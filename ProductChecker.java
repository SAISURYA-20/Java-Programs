package day1;

public class ProductChecker {
	public static boolean isproduct(int a, int b, int c) {
		if(a*b==c) {
			return true;
		}
		else 
			return false;
		
	}
	public static void main(String[] args) {
		System.out.println(isproduct(2, 3, 6));
	}

}
