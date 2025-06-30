package day35;
import java.util.*;
public class Ques3 {
	public static void main(String[] args) {
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		map1.put(1, 100);
		map1.put(2,200);
		System.out.println("Printing the entire map,row by row");
		for(Map.Entry<Integer,Integer> m: map1.entrySet())
			System.out.println(m);
		int v=map1.get(1);
		System.out.println(1+" is mapped to "+v);
		v=map1.get(2);
		System.out.println(2+" is mapped to" +v);
		if(map1.containsKey(3)) {
			v=map1.get(3);
			System.out.println(3+" is mapped to" + v);
			}
		else 
			System.out.println(3+" is not in the map");
	}

}
