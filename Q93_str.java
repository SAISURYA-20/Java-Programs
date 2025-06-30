package day26;
import java.util.Scanner;
public class Q93_str {
	public static void VowelsAndConsonants(String data)
	{
		int vowels=0;
		int consonants=0;
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(isVowel(c))
			{
				vowels++;
			}
			else if(Character.isAlphabetic(c))
			{
				consonants++;
			}
		
		}
		System.out.println("Number of vowels="+vowels);
		System.out.println("Number of consonants="+consonants);
	}
	public static boolean isVowel(char c) {
		c=Character.toUpperCase(c);
		return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		VowelsAndConsonants(name);
		sc.close();
	}

}
