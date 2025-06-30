package day1;

import java.util.Scanner;

public class WeightConveter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight in kilogram : ");
		double weightKgs=sc.nextDouble();
		convert(weightKgs);
	}
	public static void convert(double kgs ) {
		double weightsGms,weightsMg;
		weightsGms=kgs*1000;
		weightsMg=weightsGms*1000;
		System.out.println("The converted weight in grams is = " + weightsGms);
        System.out.println("The converted weight in miligrams is = " + weightsMg);
	}

}
