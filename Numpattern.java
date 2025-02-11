class Numpattern
{
public static void main(String[] args)
{
int n=20;
int num=0;
for(int i=0;i<n;i++){
     for(int j=0;j<i;j++)
{
           System.out.print(num++ +" ");
}
System.out.println();
}
}
}