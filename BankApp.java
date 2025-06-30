package day24;
abstract class Account{
	int accNo;
	String name;
	float balance;
	abstract float withdraw(float x);
	abstract float deposit(float x);
}
class SavingAccount extends Account
{

	@Override
	float withdraw(float x) {
		balance -=x;
		return balance;
	}

	@Override
	float deposit(float x) {
		balance +=x;
		return balance;
	}
	float getROI()
	{
		return 4.0f;
	}
	
}

public class BankApp {
	public static void main(String[] args) {
		Account ac1=new SavingAccount();
		ac1.deposit(5000);
		float w=ac1.withdraw(4000);
		System.out.println(w);
		float f=((SavingAccount) ac1).getROI();
		System.out.println(f);
	}

}
