package day24;
class Surya{
	private int pin_num=1234;
	protected float bankbal=9999;
	public String pub_address="Rajahmundry";
	public int getPin_num() {
		return pin_num;
	}
	public void setPin_num(int pin_num) {
		this.pin_num = pin_num;
	}
	public float getBankbal() {
		return bankbal;
	}
	public void setBankbal(float bankbal) {
		this.bankbal = bankbal;
	}
	
}
class Jashwanth extends Surya
{
	String getDetails()
	{
		return "Jashwanth,address=Nellore";
	}
}

public class Inheritance_demo {
	public static void main(String[] args) {
		Surya s1=new Surya();
		System.out.println(s1.getBankbal());
		System.out.println(s1.pub_address);
		System.out.println();
		
		
	}

}
