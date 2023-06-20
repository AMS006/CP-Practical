package BookProblems;

import java.util.Scanner;
// Create two variable a and b and read input a ,b
// if b == 0 then x =1 y = 0 and d= a
// Call eculid function by passing(a,a%b)
// then initialize x1 = y, y1 = x-(a/b) * y and x = x1 and y = y1
// Print value of x , y , d

public class EuclidProblem {
    static int x, y, d;
    public static void euclid(int a, int b){
        if (b == 0){
            x = 1;
            y = 0;
            d = a; 
            return; 
        } 
        euclid(b, a % b);
        int x1 = y;
        int y1 = x - (a / b) * y;
        x = x1;
        y = y1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            euclid(a,b);
            System.out.println(x + " " + y + " " + d);
        }        
        
    }
}
