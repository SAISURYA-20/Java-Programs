package day26;
import java.util.Scanner;
public class Q94_str {
	public static void printCharacterArray(String data)
	{
		char[] CharArray=data.toCharArray();
		System.out.print("Characters in the given array: ");
		for(int i=0;i<CharArray.length;i++)
		{
			System.out.print(CharArray[i]);
			if(i<CharArray.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		printCharacterArray(name);
		sc.close();
	}

}
