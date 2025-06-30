package samplesquestion;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Sample5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> x=new HashMap<>();
		for(char c:s.toCharArray()) {
			x.put(c, x.getOrDefault(c, 0)+1);
		}
		int min=Integer.MAX_VALUE;
		for(Entry<Character,Integer>n:x.entrySet()) {
			if(n.getValue()<min) {
				min=n.getValue();
			}
		}
		System.out.println(min);
	}

}
