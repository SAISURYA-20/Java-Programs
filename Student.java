package oops;

public class Student {
	int vtuno;
	String name;
	String dept;
	long contactnumber;
	String fathername;
	String mothername;
	float marks[]=new float[15];
	float findpercentage(int nsubject)
	{
	float x=0;
	for(int i=0;i<nsubject;i++)
	x=x+marks[i];
	return x/nsubject;
	}
	void printDetails()
	{
		System.out.println(vtuno);
		System.out.println(name);
		System.out.println(contactnumber);
		System.out.println(fathername);
		System.out.println(mothername);
	}
	Student(int vtuno,String name,String dept,long contactnumber,String fathername,String mothername)
	{
		this.vtuno=vtuno;
		this.name=name;
		this.dept=dept;
		this.contactnumber=contactnumber;
		this.fathername=fathername;
		this.mothername=mothername;	
	}
	public static void main(String[] args) {
		Student s=new Student(23908,"Surya","CSE",9705665139L,"Radha krishna","Kanya kumari");
		s.marks=new float[]{80,88,89,75,90,79,95};
		float ans=s.findpercentage(7);
		System.out.println(ans);
		s.printDetails();
		
		Student s1=new Student(22599,"Chintu","CSE",8639567622L,"R","K");
		s1.marks=new float[]{80,70,75,79,90,79,95};
		float ans1=s1.findpercentage(7);
		System.out.println(ans1);
		s1.printDetails();
	}

}
