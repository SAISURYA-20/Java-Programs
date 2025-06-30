package oops;

public class Employee {
	int empnumber;
	String dept;
	
	public  Employee( )
	{
		this.empnumber=1;
	}
	public Employee(int enumber) {
		this.empnumber=enumber;
	}
	public Employee(int i, String s1) {
		this.empnumber=i;
		this.dept=s1;
	}
public static void main(String[] args) {
	Employee e1=new Employee();
	System.out.println(e1.empnumber);
	Employee e2=new Employee(23908);
	System.out.println("e2.empnumber="+e2.empnumber);
	Employee e3=new Employee(22599,"cse");
	System.out.println(e3.empnumber);
	System.out.println(e3.dept);	
}
}
