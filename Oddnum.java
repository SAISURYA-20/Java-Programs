import java.util.Scanner;
class Oddnum{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number");
int num1=scan.nextInt();
if(num1%2!=0)
{
  System.out.println("It is odd number");
}
else if(num1%2==0)
{
System.out.println("It is even number");
}
}

}