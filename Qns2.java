package day19;

public class Qns2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,44,55};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			min=Math.min(min, a[i]);
		}
		System.out.println(min + " = min ");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(max, a[i]);
		}
		System.out.println(max + " = max ");
		
	}

}
