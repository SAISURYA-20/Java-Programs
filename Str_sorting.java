package day21;

import java.util.Arrays;

public class Str_sorting {
public static void main(String[] args) {
	String s1="surya";
	String s2="manoj";
	String s3="basha";
	String s[]= {s1,s2,s3};
	Arrays.sort(s);
	for(String t:s)
		System.out.println(t);
}
}
