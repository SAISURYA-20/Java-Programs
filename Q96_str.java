package day26;

import java.util.Scanner;

public class Q96_str {
	public static String StrToLowerCase(String data)
	{
		return data.toLowerCase();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String lowercaseName=StrToLowerCase(name);
		System.out.println("lowercase word=\""+lowercaseName+"\"");
		sc.close();
	}

}
