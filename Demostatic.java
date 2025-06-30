package oops;

public class Demostatic {
	static int k=0;
	static void hello(){
		System.out.println("Hello");
		System.out.println(k);
		k++;
	}
	void hi()
	{
		System.out.println("hi");
		System.out.println(k);
	}
	public static void main(String[] args) {
		System.out.println(k);
		k++;
		hello();
		Demostatic ds=new Demostatic();
		ds.hi();
	}

}
