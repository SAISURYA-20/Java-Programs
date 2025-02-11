import java.util.Scanner;
class Calculator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
char c=s.next().charAt(0);
int result=0;
switch(c)
{
case '+':
      result=num1+num2;
      break;
case '-':
       result=num1-num2;
       break;
case '*':
       result=num1*num2;
       break;
case '%':
       result=num1%num2;
       break;
case '/':
       result=num1/num2;
       break;
default:
      System.out.println("invalid input");
}
System.out.println(result);
}
}

