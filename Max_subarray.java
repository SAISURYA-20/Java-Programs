package day16;

public class Max_subarray {
	static int findmaxsubarray(int a[])
	{
		int max=0;
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(a[i],max+a[i]);
			x=Math.max(max,x);
			System.out.println("max="+max);
			System.out.println("x="+x);
		}
		return x;
	}
	public static void main(String[] args) {
		int a[]= {11,22,33,-44,55};
		int ans=findmaxsubarray(a);
		System.out.println(ans);
		
	}

}
