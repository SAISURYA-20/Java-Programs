package day26;

public class Cube {
	static int Findvalue(int a, int b) {
		int m=(int)Math.pow(a, 3);
		int n=(int)Math.pow(b,3);
		int m1=(3*((int)Math.pow(a, 2))*b);
		int m2=(3*a*((int)Math.pow(b, 2)));
		int ans=m+n+m1+m2;
		return ans;
	}
	public static void main(String[] args) {
		int s=Findvalue(3,4);
		System.out.println(s);
		
	}

}
