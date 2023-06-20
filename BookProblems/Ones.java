package BookProblems;

import java.util.Scanner;
// Create variable n read input n
// initialize numDigits by 1 and value = 1%n
// While value >0 increment numDigits by one and value = ((value * 10) + 1)%n
// Print numDigits

public class Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int numDigits = 1;
            int value = 1 % n;
        
            while (value > 1){
                    ++numDigits;
                    value = ((value * 10) + 1) % n;
            }
            System.out.println("Result " + numDigits);
        sc.close();

    }
}
