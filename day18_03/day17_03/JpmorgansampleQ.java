package day17_03;

import java.util.Scanner;

public class JpmorgansampleQ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int deci=0;
		int base=0;
		for(char c:s.toCharArray()) {
			int digit=c-'a'+1;
			deci=deci*base+digit;
		}
		System.out.println(deci);
	}

}
