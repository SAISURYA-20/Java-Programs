package day12;

public class Oddseries {
	void oddseries(int n)
	{
		for(int i=1;i<=2*n;i++)//i+=2 without logic
			if(i%2!=0)
				System.out.println(i);
				
	}
	public static void main(String[] args) {
		Oddseries obj=new Oddseries();
		obj.oddseries(5); 
		
	}

}
