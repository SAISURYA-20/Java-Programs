package day23;

public class MethodOverloading_Demo {
	int add(int x,int y)
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public static void main(String[] args) {
		MethodOverloading_Demo m1=new MethodOverloading_Demo();
		System.out.println(m1.add(9, 7));
		System.out.println(m1.add(8, 9, 6));
	}

}
