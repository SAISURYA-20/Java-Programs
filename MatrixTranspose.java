package day26;

public class MatrixTranspose {
	public static void main(String[] args) {
		int a[][]=new int[][]{{2,2,2},{7,8,9},{1,1,1}};
		System.out.println("Normal Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("Transpose Matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i] + " ");		
			}
			System.out.println();
					
}
		System.out.println("lower triangular Matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[i][j] + " ");		
			}
			System.out.println();
		}
		
		System.out.println("upper triangular Matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++)
			{
				System.out.print(a[i][j] + " ");		
			}
			System.out.println();
		}
}
}
