package day26;
import java.util.Scanner;
public class Q89_str {
	public static void printUpperCase(char[] name)
	{for(int i=0;i<name.length;i++)
		{name[i]=Character.toUpperCase(name[i]);
		}}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		char[] name=new char[n];
		for(int i=0;i<n;i++)
		{System.out.println("enter character" + (i+1) + ":");
			name[i]=sc.nextLine().charAt(0);
		}System.out.println("Before conversion: ");
		for(char c : name)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		printUpperCase(name);
		System.out.println("After conversion: ");
		for(char c : name)
		{
			System.out.print(c+" ");
			sc.close();
		}
	}

}
