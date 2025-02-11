import java.util.Scanner;
class Nestedif{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a two number:");
int num1=scan.nextInt();
int num2=scan.nextInt();
int sum=0;
sum=num1+num2;
if(sum==0){
  System.out.println("zero");
}
else if(sum>0){
    System.out.println("square:"+ sum*sum);
}
else{
System.out.println("cube:"+ sum*sum*sum);
}
}
}
  
