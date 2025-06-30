package day1;

public class QuantityOfPetrol {
	public static void main(String[] args) {
		float a,b;
		Double a1,b1;
		float petrol=74.91f;
		float diesel=84.11f;
		float walletbalance=1546.12f;
		a=walletbalance/petrol;
		b=walletbalance/diesel;
		
		Double petrol1=74.91d;
		Double diesel1=84.11d;
		Double walletbalance1=1546.12d;
		a1=walletbalance1/petrol1;
		b1=walletbalance1/diesel1;
		System.out.println ("The quantity of petrol that we can buy in " +walletbalance + " is " + a);
        System.out.println ("The quantity of petrol that we can buy in " +walletbalance + " is " + b);
        System.out.println ("The quantity of petrol that we can buy in " +walletbalance1 + " is " + a1);
        System.out.println ("The quantity of petrol that we can buy in " +walletbalance1 + " is " + b1);
		
		
		
		
	}

}
