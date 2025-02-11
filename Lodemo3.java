class Lodemo3
{
public static void main(String[] args)
{
int n=99999;
for(int i=10000;i<n;i++)
{
if(i%2==0 && i%3==0 && i%5==0)
System.out.println("i="+i);
}
}
}