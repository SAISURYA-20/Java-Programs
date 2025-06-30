package samplesquestion;
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int H = sc.nextInt();
        int HH = sc.nextInt();
        int total = H * HH;
        int nofdel = 0;
        int[] VV = new int[V];
        for (int i = 0; i < VV.length; i++) {
            VV[i] = sc.nextInt();
        }

        for (int i = VV.length - 1; i >= 0; i--) {
            if (total >= VV[i]) {
                total -= VV[i];
            } else {
                nofdel++;
            }
        }
        System.out.println(nofdel);
    }
}