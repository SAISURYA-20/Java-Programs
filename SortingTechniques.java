package day26;

public class SortingTechniques {
	public static void main(String[] args) {
		int data[]= {11,22,33};
		fx(data);
		for(int i=0;i<data.length;i++)
		  System.out.printf("%d",data);
		
}
static int[] fx(int a[])
{
	for(int i=0;i<a.length;i++)
		a[i]=a[i]*2;
	return a;

}
}

