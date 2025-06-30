package day17_03;
import java.util.*;

public class N_baseNotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int base = sc.nextInt();
        int n = sc.nextInt();

        if (base < 2 || base > 36) {
            System.out.println("Base should be between 2 and 36.");
        } else {
            if (n == 0) {
                str.append('0'); 
            } else {
                while (n > 0) {
                    int digit = n % base;
                    str.append(s.charAt(digit));
                    n /= base;
                }
            }
            System.out.println(str.reverse());
        }
    
    }
}
