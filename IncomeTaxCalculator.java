package day21;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Annual Income: ");
		double income=sc.nextDouble();
		double tax=0;
		if(income <=250000)
		{
			tax=0;   // no tax upto 2.5 lakh
		}
		else if(income <=500000)
		{
			tax=(income-250000)*0.05; //5% tax on income while exceeding 2.5lakh
		}
		else if(income <=1000000)
		{
			 tax=(income-500000)*0.2; //20% tax on income while exceeding 5lakh
		}
		else
		{
			tax=112500 + (income-1000000)*0.3;  //30% tax on income while exceeding 10 lakhs 
		}
		System.out.println("Your income tax is:"+tax);
		sc.close();
	}

}
