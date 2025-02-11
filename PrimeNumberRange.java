class PrimeNumberRange{
public static void main(String[] args)
{
int start=1, end=100;
for(int k=start;k<=end;k++){
int n=k;
if(n==1)
{
System.out.println("N=1,it is not prime,not composite");
continue;
}
int f=0; // assume is a prime
for(int i=2;i<n;i++)
{
if(n%i==0 )
{  
f=1;          //is not a prime
break;
}
}


if( f ==0)
{
System.out.println(k+"is prime");
}}

}
}
