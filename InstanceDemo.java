package oops;
class Employee1
{
	int empid;
	String empname;
	float Salary;
	void printDetalis()
	{
		System.out.println(empid+empname+"earns"+Salary);
	}
}

public class InstanceDemo {
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.printDetalis();
	}

}
