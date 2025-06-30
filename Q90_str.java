package day26;
import java.util.Scanner;
public class Q90_str {
	public static void printVowels(char[] data)
	{int count=0;
		for(int i=0;i<data.length;i++)
		{char c=data[i];
			if(isVowel(c))
			{count++;
			}
		}System.out.println("Number of vowels="+count);
	}
	public static boolean isVowel(char c)
	{c=Character.toLowerCase(c);
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		sc.nextLine();
		char[] name=new char[s];
		for(int i=0;i<s;i++)
		{
			System.out.println((i+1));
			name[i]=sc.nextLine().charAt(0);
		}
		printVowels(name);
		sc.close();
		
		
	}

}
