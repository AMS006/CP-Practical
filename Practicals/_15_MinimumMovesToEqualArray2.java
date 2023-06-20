package Practicals;
import java.util.Arrays;
import java.util.Scanner;

public class _15_MinimumMovesToEqualArray2 {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid =  nums[nums.length / 2];
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res += Math.abs(mid - nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(minMoves2(arr));
        sc.close();
    }
}
