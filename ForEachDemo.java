package day10;

public class ForEachDemo {
	public static void main(String[] args) {
		int a[]= {20,30,40};
		for(int k:a) //for each loop--modified loop
			System.out.println(k);
		System.out.println("normal for loop printing");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
