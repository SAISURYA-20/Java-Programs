package day12;

public class Isfibchecker {
	boolean isfib(int n) {
		int e1=5*(n*n)+4;
		int e2=5*(n*n)-4;
		
		int ans1=(int) Math.sqrt(e1);
		int ans2=(int) Math.sqrt(e2);
		if(ans1*ans1==e1)
			return true;
		if(ans2*ans2==e2)
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		Isfibchecker obj=new Isfibchecker();
		boolean ans=obj.isfib(3);
		System.out.println(ans);
		ans=obj.isfib(13);
		System.out.println(ans);
	}

}
