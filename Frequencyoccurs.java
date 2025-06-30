package day35;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;


public class Frequencyoccurs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> x=new HashMap<>();
		for(char c:s.toCharArray()) {
			x.put(c, x.getOrDefault(c, 0)+1);
		}
		char minchar=' ';
		char maxchar=' ';
		char uniquechar=' ';
		int mincount=Integer.MAX_VALUE;
		int maxcount=Integer.MIN_VALUE;
		for(Entry<Character,Integer> y:x.entrySet()) {
			int frequency=y.getValue();
			char character=y.getKey();
			if(frequency>maxcount) {
				maxcount=frequency;
				maxchar=character;
			}
			if(frequency<mincount) {
				mincount=frequency;
				minchar=character;
			}
			if(frequency==1) {
				uniquechar=character;
			}
		}
		char lexiMinCharMinCount=minchar;
		char lexiMaxCharMinCount=minchar;
		char lexiMinCharMaxCount=maxchar;
		char lexiMaxCharMaxCount=maxchar;
		for(Entry<Character,Integer> y:x.entrySet()) {
			char character=y.getKey();
			int frequency=y.getValue();
			if(frequency==mincount) {
				if(character<lexiMinCharMinCount) 
				{
					lexiMinCharMinCount=character;
				}
				if(character>lexiMaxCharMaxCount) {
					lexiMaxCharMaxCount=character;
				}
			}
			
		}
		System.out.println("Character frequenices:");
		for(Entry<Character,Integer>y:x.entrySet()) {
			System.out.println(y.getKey()+ " occurs "+y.getValue()+" times ");
		}
		System.out.println("character min frequency:"+minchar);
		System.out.println("character max frequency:"+maxchar);
		System.out.println("unique character:"+uniquechar);
		System.out.println("Lexicographically smallest character among min frequency chars: " + lexiMinCharMinCount);
	    System.out.println("Lexicographically largest character among min frequency chars: " + lexiMaxCharMinCount);
	    System.out.println("Lexicographically smallest character among max frequency chars: " + lexiMinCharMaxCount);
	    System.out.println("Lexicographically largest character among max frequency chars: " + lexiMaxCharMaxCount);

		
	}

}
