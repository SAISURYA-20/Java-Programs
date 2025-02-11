class Student
{
int vtuno;
String name;
String dept;
String fathername;
String mothername;
long contactnumber;
float marks[]=new float[15];
float findCGPA(int nSubjects)
{
    float x=0;
    for(int i=0;i<nSubjects;i++)
    x=	x + marks[i];
    return x/nSubjects;
}
void printdetails()
{
System.out.println(vtuno);
System.out.println(name);
System.out.println(dept);
System.out.println(fathername);
System.out.println(mothername);
System.out.println(contactnumber);
}
Student(int vtuno,String name,String dept,String fathername,String mothername,long contactnumber)
{
this.vtuno=vtuno;
this.name=name;
this.dept=dept;
this.fathername=fathername;
this.mothername=mothername;
this.contactnumber=contactnumber;
}
public static void main(String[] args)
{
Student s1=new Student(23908,"surya","cse","radha","kumari",9705665139L);
s1.marks=new float[]{70,80,88,75,84,77,86,95};
float ans1=s1.findCGPA(8);
System.out.println(ans1);
s1.printdetails();
}
}
