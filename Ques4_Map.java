package day35;
import java.util.*;
public class Ques4_Map {
	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("StylishStar", "AlluArjun");
		map1.put("NaturalStar", "Nani");
		map1.put("Darling", "prabhas");
		System.out.println("Printing the entire Map,row by row");
		//print only keys
		Set<String> keys=map1.keySet();
		System.out.println(keys);
		//print all values
		Collection<String> c1=map1.values();
		System.out.println(c1);
		//print row by row
		System.out.println("full map= " +map1);
		for(Map.Entry e1: map1.entrySet())
			System.out.println("next => "+e1);
		boolean b1=map1.containsKey("Surya");
		boolean b2=map1.containsValue("AlluArjun");
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);

}
}
