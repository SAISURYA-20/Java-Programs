class Lodemo1
{
public static void main(String[] args)
{
int n=25;
for(int i=1;i<n;i++)
{
if(i%2==0 || i%3==0 || i%5==0 || i%11==0)
System.out.println("i="+i);
}
}
}