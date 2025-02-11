import java.util.Scanner;
class Num{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int num=scan.nextInt();
if(num>=0)
{
 System.out.println("It is Positive Number");
}
else{
System.out.println("It is Negative Number");
}
}
}
