package day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		List<String>x=new ArrayList();
		x.add("Surya");
		x.add("Chintu");
		x.add(1,"Aravind");
		x.addLast("Sai");
		//x.clear();
		System.out.println(x);
		System.out.println(x);
		Iterator<String> it=x.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
}
