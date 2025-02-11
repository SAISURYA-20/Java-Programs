import java.util.Scanner;
class Month{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a Month:");
int num=scan.nextInt();
if(num==1)
    System.out.println(num+"--> It has 31 days");
else if(num==2)
           System.out.println(num+"--> february has 28 or 29 days");
else if(num==3)
           System.out.println(num+"--> March has 31 days");
else if(num==4)
           System.out.println(num+"--> April has 30 days");
else if(num==5)
           System.out.println(num+"--> May has 31 days");
else if(num==6)
           System.out.println(num+"--> June has 30 days");
else if(num==7)
           System.out.println(num+"--> July has 31 days");
else if(num==8)
           System.out.println(num+"--> August has 31 days");
else if(num==9)
           System.out.println(num+"--> September has 30 days");
else if(num==10)
           System.out.println(num+"--> October has 31 days");
else if(num==11)
           System.out.println(num+"--> November has 30 days");
else if(num==12)
           System.out.println(num+"--> December has 31 days");
else
           System.out.println("invalid input");
}
}
