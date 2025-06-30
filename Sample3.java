package samplesquestion;
import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] L=new int[N];
		
		for(int i=0;i<N;i++) {
			L[i]=sc.nextInt();		
		}
		int days=0;
		boolean transformed=false;
		while(!transformed) {
			transformed=true;
		for (int i = 1; i < N; i++) {
            if (L[i-1] <= L[i]) {
                L[i]-= (1 << days);
                transformed = false;
            }
        }
        if (!transformed) {
            days++;
        }
    }
		System.out.println(days);
	}

}
