package day15;

public class Make_equal {
	static int makeequal(int a[]) {
		int count=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min+"=min");
		for(int i=0;i<a.length;i++) {
			int x=a[i];
			count=count+Math.abs(a[i]-min);
		}
		return count;
	}

	public static void main(String[] args) {
		int ans=makeequal(new int[] {1,2,3});
		System.out.println(ans);
		 ans=makeequal(new int[] {100,2,3});
		System.out.println(ans);


	}

}
