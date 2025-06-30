package day1;

import java.util.*;
import java.util.HashMap;
public class IdentifySingleNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> x=new HashMap<>();
		for(int y:a) {
			x.put(y, x.getOrDefault(y, 0)+1);	
		}
		ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int key : x.keySet()) {
            if (x.get(key) == 1) {
                uniqueNumbers.add(key);
            }
        }

        System.out.println(uniqueNumbers);
		
	}
}