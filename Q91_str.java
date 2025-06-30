package day26;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Q91_str {
	public static void printUniqueConsonants(char[] data){
		Set<Character>consonants=new HashSet<>();
		for(int i=0;i<data.length;i++)
		{
			char c=Character.toLowerCase(data[i]);
			if(isConsonant(c))
			{
				consonants.add(c);
			}
		}System.out.println("Number of unique consonants="+consonants.size());	
	}public static boolean isConsonant(char c)
	{return Character.isAlphabetic(c)&&
				!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
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
		printUniqueConsonants(name);
		sc.close();
				
	}

}
