package day15;

public class Linearsearch {
	static int linearsearch(int a[],int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int ans=linearsearch(new int[] {22,33,44,55},44);
		System.out.println(ans);
	}

}
