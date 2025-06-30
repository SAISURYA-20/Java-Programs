package day1;

public class DogBarking {
	public static void main(String[] args) {
		boolean response=shouldwakeup(true , 9) ;
			System.out.println(response);
		
	}
	public static boolean shouldwakeup(boolean barking, int hourOfDay) {
		if(hourOfDay>=1 && hourOfDay<=23) {
			if(barking==true && hourOfDay<8 || hourOfDay>22) {
				return true;
			}else {
				return false;
			}
		}
		else 
			return false;
	}

}
