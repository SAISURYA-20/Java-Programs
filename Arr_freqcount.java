package day16;

import java.util.Arrays;

public class Arr_freqcount {
	static void printfreqcount(int a[])
	{
		int fc=0;
		for (int i = 0; i < a.length; i++) {
			int x=a[i];
			for (int j = 0; j < a.length; j++) {
				if(x==a[j])
					fc++;
				
			}
			System.out.println(x+"occurs "+fc);
			fc=0;
			
		}
	}

	public static void main(String[] args) {
		int n=11;
		int a[] = {1,2,3,1,2,3,4,5,6,5,4};
		Arrays.parallelSort(a);
		printfreqcount(a);
		

	}

}
