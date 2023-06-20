package Practicals;
import java.util.*;

// Create a variable idx initialize it with zero
// Loop through the array and if element becomes equal to zero then 
// swap that element with array index at idx and increment idx
// Again Loop through the array and if element becomes equal to one
// then swap that element with array index at idx and increment idx

public class _24_SortColors{
    public static void sortColors(int[] nums) {
        int idx = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }
        }
        for(int i = idx;i<nums.length;i++){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        sortColors(arr);

        for(int i = 0;i<n;i++)
            System.out.print(arr[i] + " ");

        sc.close();

    }
}
