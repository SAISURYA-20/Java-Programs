package day26;

import java.util.Scanner;

public class Q95_str {
	public static String StrToUpperCase(String data)
	{
		return data.toUpperCase();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String uppercaseName=StrToUpperCase(name);
		System.out.println("Uppercase word=\""+uppercaseName+"\"");
		sc.close();
	}

}
