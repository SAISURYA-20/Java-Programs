package samplesquestion;

import java.util.*;

public class Sample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt(); 
        int N = sc.nextInt(); 
        int[] e = new int[N];
        for(int i=0;i<N;i++) {
        	e[i]=sc.nextInt();
        }
        int totalexercise=0;
        for(int exercise:e) {
        	for(int i=0;i<2;i++) {
        		if(E>=exercise) {
        			E-=exercise;
        			totalexercise++;
        		}
        		else {
        			System.out.println(-1);
        			return;
        		}
        	}

        }
        System.out.println(totalexercise);
    }
}
