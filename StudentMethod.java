package day1;

public class StudentMethod {
	public static void main(String[] args) {
		String name="Surya";
		int marks=95;
		char Grades=GradeCalculator(marks);
		DisplayDetails(name, Grades);
		
	}
	public static char GradeCalculator(int marks) {
		char Grade;
		if(marks>90 && marks<=100) {
			Grade='S';
		}
		else if(marks>80 && marks<=90) {
			Grade='A';
		}
		else if(marks>70 && marks<=80) {
			Grade='B';
		}
		else
		{
			Grade='F';
		}
		return Grade;
	}
	public static void DisplayDetails(String name,char Grade) {
		System.out.println("The Student Name is : "+ name + " He Score a grade = "+ Grade);
	}
		
	

}
