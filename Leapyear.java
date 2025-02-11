import java.util.Scanner;
class Leapyear{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a year:");
int num=scan.nextInt();
if(num%4==0 && num%100!=0 || num%400==0)
{
System.out.println("It is a leap year"); 
}
else{
System.out.println("It is not a leap year");
}
}
}