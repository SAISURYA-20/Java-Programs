package day1;

import java.util.Scanner;

public class MegaBytesConvert {
	public static void printmegabytes(int kilobytes) {
		if(kilobytes<0) {
			System.out.println("invalid input");
		}else {
			int megabytes=(kilobytes/1024);
			int kiloremainder=kilobytes%1024;
			System.out.println(kilobytes + " KB = " + megabytes + " MB  " + kiloremainder + " KR ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kilobytes=sc.nextInt();
		printmegabytes(kilobytes);
	}

}
