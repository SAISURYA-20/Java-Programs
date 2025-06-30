package day26;

import java.util.Scanner;
public class Q92_str {
	public static void printLowerandUpper(char[] data) {
		int lowerCaseConsonants=0;int upperCaseConsonants=0;
		for(int i=0;i<data.length;i++)
		{char c=data[i];
			if(isLowerCaseConsonant(c))
			{lowerCaseConsonants++;
			}if(isUpperCaseConsonant(c))
			{upperCaseConsonants++;
			}}
		System.out.println("Number of lower case consonants="+lowerCaseConsonants);
		System.out.println("Number of upper case consonants="+upperCaseConsonants);
	}
	public static boolean isLowerCaseConsonant(char c)
	{c=Character.toLowerCase(c);
		return c>='a' && c<='z' && !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
	}
	public static boolean isUpperCaseConsonant(char c)
	{
		return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
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
		printLowerandUpper(name);
		sc.close();
		
	}

}
