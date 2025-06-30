package day26;
import java.util.Scanner;
public class Q87_Str {
	public static void printASCII(int[] data)
	{
		System.out.println("char\t\tASCII Value");
		for(int i=0;i<data.length;i++)
		{
			System.out.println((char)data[i]+"\t\t"+data[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		int arr=sc.nextInt();
		int[] m= new int[arr];
		for(int i=0;i<arr;i++)
		{
			System.out.println("enter character " + (i+1) + ": ");
			m[i]=sc.next().charAt(0);
		}
		printASCII(m);
		sc.close();
	}

}
