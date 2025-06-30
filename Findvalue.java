package day13;

public class Findvalue {
	static int Dealership(int n,int a[],int b[])
	{
		int c=0;
		for(int i=0;i<a.length;i++) {
			c=c+a[i]*4;
		    c=c+b[i]*2;	
		}
	return c;
	}
	public static void main(String[] args) {
		int ans=Dealership(3,new int[] {4,4,2},new int[] {2,0,2});
		System.out.println(ans);
		
	}

}
