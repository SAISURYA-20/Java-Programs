class Booleanisprime{
public static void main(String[] args)
{
int n=17;
for(int i=2;i<n;i++)
{
Boolean num=n%1==0 && n%7==0;
if(num==true)
   {
System.out.print(n+"is not a prime");
}
else
{
System.out.println(n+"is a prime");
}
break;
}
}
}		


