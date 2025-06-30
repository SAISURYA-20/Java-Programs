package day12;

public class Squaretable {
	static void printSquareTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("square("+i+")="+i*i);
		}
	}
	static void printCubeTable(int n) {
		for(int i=1;i<=n;i++)
		{
			System.out.println("cube("+i+")="+i*i*i);
		}
		
	}
	public static void main(String[] args) {
		printSquareTable(5);
		printCubeTable(5);
	}

}
