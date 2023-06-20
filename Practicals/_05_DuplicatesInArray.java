package Practicals;
import java.util.*;

// Create a list res of integer to store duplicates
// Loop through the array element and for every element do the following
// 1. If nums[Math.abs(nums[i] -1) < 0] then add Math.abs(nums[i]) to res
// 2. else update nums[Math.abs(nums[i] - 1)] to nums[Math.abs(nums[i] -1)] * -1;
// Then return the result

public class _05_DuplicatesInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[Math.abs(nums[i]) - 1] < 0){
                res.add(Math.abs(nums[i]));
            }else{
                nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) -1] * -1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findDuplicates(arr));
        sc.close();
    }
}
