class Fibdemo
{
public static void main(String[] args)
{
int a=1;
int b=1;
int c;
int n=10;
System.out.println(a+" "+b);
for(int i=2;i<n;i++){
    c=a+b;
     System.out.println(c);
     n--;
     a=b;
     b=c;
}
}
}