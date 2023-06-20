package BookProblems;
import java.util.*;
public class ThreeNPlusOne{
    public static int findThreeNCount(int n){
        int count = 0;
        while(n != 1){
            if(n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3) + 1;
            
            count++;
        }
        return ++count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end index");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int count = 0;

        if(j < i){
            System.out.println("Invalid Input");
        }
        else{
            for(int k = i;k<=j;k++){
                count = Math.max(count,findThreeNCount(k));
            }
        }
        System.out.println(count);
        sc.close();
    }
}