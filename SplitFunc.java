package day26;

public class SplitFunc {
	public static void main(String[] args) {
		int sum=0;
		String s="123 224 456 next year is 2026 and it's a good year.";
		String word[] =s.split(" ");
		for(String t:word) {
			try {
				if(Integer.parseInt(t)>0) 
					System.out.println(t);
				sum=sum+Integer.parseInt(t);
			}
				catch(Exception c) {
				System.out.println("Catch Block");
			}
			}
		System.out.println(sum);
	
}

}
