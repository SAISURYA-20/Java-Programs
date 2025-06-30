package day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q97_str {
	public static void countCharacterFrequency(String input)
	{
		Map<Character,Integer>frequencyMap=new HashMap<>();
		for(char c:input.toCharArray())
		{
			frequencyMap.put(c,frequencyMap.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer>entry : frequencyMap.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		countCharacterFrequency(name);
		sc.close();
	}

}
