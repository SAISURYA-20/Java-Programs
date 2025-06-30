package day13;

public class Q_6_compare {
	static void compare_num(int a,int b)
	{
		if(a<b && a<=b && a!=b) {
			System.out.println("true");
		}
		else if(a>b && a>=b && a==b)
		{
			System.out.println("false");
		}
		else
			System.out.println("Invalid Input");
	}
		
	public static void main(String[] args) {
		compare_num(15,20);
		
		
	}

}
