package day24;
public class MatrixAdd {
	public static void main(String[] args) {
		int a[][]={{1,2,3},{3,4,5}};
		int b[][]= {{2,3,4},{3,4,5}};
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}	
	}
}
