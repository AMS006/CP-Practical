package Practicals;
import java.util.Scanner;

// create two variables evenPlaces & oddPlaces initialize evenPlaces = n/2+n%2 & oddPlaces = n/2
// Take the power of 5^evenPlaces and 4^oddPlaces and take it's mod by 10^9+7 and multiply both store it in res
// Take the mod of res by 10^9+7
// Return the res
public class _13_CountGoodNumbers {
    static long MOD = 1000000007;
    public static long pow(long x, long y){
        if(y == 0)
            return 1;
        long res = pow(x,y/2);
        res *= res;
        res %= MOD;
        if(y%2 == 1)
            res *= x;
        res%=MOD;
        return res;
        
    }
    public static int countGoodNumbers(long n) {
        long oddPlaces = n/2;
        long evenPlaces = n/2 + n%2;

        return (int)(pow(5,evenPlaces) * pow(4,oddPlaces) % MOD) ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countGoodNumbers(n));

        sc.close();

    }
}
