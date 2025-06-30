package day26;

import java.util.Scanner;

public class Sample_pro {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int spaces=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<spaces-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		obj.close();
	}

}
