package day23;
interface Calc{
	int add(int x,int y);
	int sub(int x,int y);
	int mul(int x,int y);
	int div(int x,int y);
}
class CalcImpl implements Calc{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		if(y!=0)
			return x/y;
		return 0;
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Calc if1=new CalcImpl();
		System.out.println(if1.add(100, 200));
		System.out.println(if1.sub(100, 100));
		System.out.println(if1.mul(5, 5));
		System.out.println(if1.div(10, 0));
	}

}
