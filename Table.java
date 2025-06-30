package day12;

public class Table {
	void printTable(int n)
	{
		for(int i=1;i<=2*n;i++)
			System.out.println(n+ "*"+ i +"="+n*i);
	}
	public static void main(String[] args) {
		Table obj=new Table();
		obj.printTable(5);
	}

}
