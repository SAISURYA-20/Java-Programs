package day23;
interface CSE{
	void x();
	int addtask(int x,int y);
	int addtask(int x,int y,int z);
}
interface AIML{
	void x();
	int subtask(int x,int y);
}
class student implements CSE,AIML
{

	@Override
	public int subtask(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("just one x");
	}

	@Override
	public int addtask(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int addtask(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}
	
}

public class IfDemo_MultipleInterface {
	public static void main(String[] args) {
		student s1=new student();
		s1.x();
		System.out.println(s1.addtask(2, 3));
		System.out.println(s1.subtask(5, 4));
		System.out.println(s1.addtask(2, 3, 5));
	}

}
