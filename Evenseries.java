package day12;

public class Evenseries {
	void evenseries(int n)
	{
		for(int i=0;i<2*n;i++)//i+=2 without logic
			if(i%2==0)
				System.out.println(i);
				
	}
	public static void main(String[] args) {
		Evenseries obj=new Evenseries();
		obj.evenseries(5); 
		
	}

}
