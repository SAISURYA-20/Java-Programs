package day38;


public class TCS_MaximumDigit {
	public static void main(String[] args) {
		String s="23GF";
		int deci=0;
		for(int n:s.toCharArray()) {
			int chartonumval=0;
			if(Character.isDigit(n)) {
				chartonumval=n-'0';
			}
			else {
				chartonumval=n-'A'+10;
			}
			
			deci=deci*17+chartonumval;
		}
		System.out.println(deci);
	}
	

}
