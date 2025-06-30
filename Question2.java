package day1;
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int w=sc.nextInt();
		if(w%2!=0|| v>=w || v<2 || w<2) {
			System.out.println("Invalid Input");
			return;
		}
		int fw=(w-2*v)/2;
		int tw=v-fw;
		if(tw<0||fw<0) {
			System.out.println("Invalid Input");
		}
	     else {
		System.out.println("TW="+tw+"FW="+fw);
	}
}
}
