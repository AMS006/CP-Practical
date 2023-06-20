package Practicals;
import java.util.*;
public class Gcd {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        // System.out.println(b);
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = gcd(a,b);
        System.out.println(res);

        sc.close();
    }
}
