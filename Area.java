package day26;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		 double m=Math.PI*r*r;
		 System.out.printf("%.2f \n", m);
		 System.out.printf("%.4f \n", m);
		
		 sc.close();
	}

}
