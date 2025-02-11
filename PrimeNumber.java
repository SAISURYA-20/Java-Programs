class PrimeNumber{
public static void main(String[] args)
{
int n=527;
int f=0; // assume is a prime
for(int i=2;i<n;i++)
{
if(n%3==0 )
{
System.out.println("is not prime");  
f=1;          //is not a prime
break;
}
}


if( f ==0)
{
System.out.println(n+"is prime");
}

}
}
