package BookProblems;

import java.util.Scanner;

// Read the input variable P
// Initialize count = 0
// Reverse the input number P
// While revNumber != P do the following steps
// 1. P += revNumber
// 2. revNumber = reverse(P);
// 3. count++;
// Print count and P
public class ReverseAndAdd {
    public static int revNumber(int num){
        int reverse = 0;
        while(num != 0){
            reverse *= 10;
            reverse += (num%10);
            num /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int P = sc.nextInt();
            int revNumber = revNumber(P);
            int count = 0;
            while(revNumber != P){
                P += revNumber;
                revNumber = revNumber(P);
                count++;
            }
            System.out.println("Result : "  + count + " " + P);
        }
        sc.close();
    }
}
