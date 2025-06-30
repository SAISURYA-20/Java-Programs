package day18_03;
import java.util.*;
public class JpmorganQues_8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		String out="";
		String s1="1234567890";
		String s2="baecidoefg";
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(input.charAt(i)==s1.charAt(j)) {
				out+=s2.charAt(j);
			}
		}
		}
	System.out.println(out);
}		
}


