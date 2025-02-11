import java.util.Scanner;
class Absolutenum{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int num=scan.nextInt();
if(num>0)
{
 System.out.println("zero");
}
else{
System.out.println("It is absolute number:"+ num*-1);
}
}
}