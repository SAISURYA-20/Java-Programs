import java.util.Scanner;
class Decidetheday{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int day=scan.nextInt();
if(day==1 || day==2 || day==3|| day==4 || day==5)
{
  System.out.println("working day");
}
else if(day==6)
{
   System.out.println("optional working day");
}
else if(day==7)
{
  System.out.println("willingworkig day");
}
else{
 System.out.println("invalid input");
}
}
}
  
