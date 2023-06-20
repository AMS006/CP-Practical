package BookProblems;

import java.util.Scanner;

// Read value of num1 and num2 until they are not zero
// Create and initialize count = 0 , isCarry = false
// While num1 || num2 are not equal to zero
// Take the last digit of num1 and num2 and sum them if isCarry is true increment sum and mark isCarry false
// Reduce num1 /= 10 & num2 /= 10;
// Then return count and again tage num1 and num2 as input
public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        while(num1 != 0 || num2 !=0){
            int count = 0;
            boolean isCarry = false;
            while(num1 != 0 || num2!=0){
                int sum = (num1%10) + (num2%10);

                if(isCarry){
                    sum++;
                    isCarry = false;
                }
                if(sum >= 10){
                    count++;
                    isCarry = true;
                }
                num1 /= 10;
                num2 /= 10;
            }

            if(count > 0)
                System.out.println(count + " carry operations");
            else
                System.out.println("No carry operations");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        sc.close();

    }
}
