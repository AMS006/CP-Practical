package Practicals;
import java.util.Scanner;


// Create two variables max & min and initialize them with Integer.MIN_VALUE & Integer.MAX_VALUE
// Find out the max and min value from the array and store them in max & min variable
// Find the GCD for the max & min value
// Return the GCD 
public class _22_GreatestCommonDivisor {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max)
                max = nums[i];
            if(nums[i] < min)
                min = nums[i];
        }
        return gcd(max,min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        
        System.out.println(findGCD(arr));

        sc.close();
    }
}
