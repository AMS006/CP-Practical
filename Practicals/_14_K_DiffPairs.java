package Practicals;
import java.util.*;

// Declare a Empty Integer Set say set and and empty List of Integer set say res
// Sort element of array in ascending order
// Traverse through elements of array and do following
// 1. If set contains (num -k) or (num+k) then in res set add current pair as (num, num -k)
// 2. Add current elemnet to set
// Then return the size of res set
public class _14_K_DiffPairs {
    public static int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        
        for(int num: nums){
            if(set.contains(num - k) || set.contains(num + k))
                res.add(new ArrayList<>(Arrays.asList(num,num - k)));
            set.add(num);
        }
        return res.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(findPairs(arr, k));

        sc.close();


    }
}
