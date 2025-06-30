package day11;

public class Isfib {
	boolean isfibonacci(int n)
	{
		int a=0;
		int b=1;
		while(a<n) {
			int c=a+b;
			a=b;
			b=c;
			
			if(a==n)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Isfib obj=new Isfib();
		boolean ans=obj.isfibonacci(9);
		System.out.println(ans);
	}

}
