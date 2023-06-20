package BookProblems;

import java.util.Scanner;

// Read value of n until user enter zero
// Find the square root of n store in root variable
// Check If root * root == n then print yes else print no

public class LightMoreLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int root = (int)Math.sqrt(n);
            if(root * root == n)
                System.out.println("Yes");
            else
                System.out.println("No");
            
            n = sc.nextInt();
        }
        sc.close();
    }
}
