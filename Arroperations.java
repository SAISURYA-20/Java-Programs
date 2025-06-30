package day19;

public class Arroperations {
	static int[] doOperations(int data[],int x,char op)
	{
		if(op=='+')
		{
			for(int i=0;i<data.length;i++)
				data[i]=data[i]+x;
		}
		if(op=='-')
		{
			for(int i=0;i<data.length;i++)
				data[i]=data[i]-x;
		}
		if(op=='*')
		{
			for(int i=0;i<data.length;i++)
				data[i]=data[i]*x;
		}
		if(op=='/')
		{
			for(int i=0;i<data.length;i++) {
				try{
					data[i]=data[i]/x;}
				catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
			}
		}
		return data;
	}
	public static void main(String[] args) {
		int data[]= {10,5,15};
		int x=0;
		char op='/';
		data =doOperations(data,x,op);
		if(data==null)
		{
			System.out.println("something went wrong");
		}
		else {
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);}
		System.out.println("end of the main");

	}

}
