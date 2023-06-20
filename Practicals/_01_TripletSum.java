package Practicals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _01_TripletSum {
    public static boolean twoSum(int arr[], int s, int e,int target, int first, Set<List<Integer>> res){

        int sum = 0;
        while(s < e){
            sum = arr[s] + arr[e];
            if(sum == target){
                List<Integer> list = new ArrayList<>();
                list.add(arr[first]);
                list.add(arr[s]);
                list.add(arr[e]);
                res.add(list);
                s++;
                e--;
            }
            else if(sum > target)
                e--;
            else 
                s++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("target : ");
        int target = sc.nextInt();
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0;i<n-2;i++){
           twoSum(arr, i+1, n-1, target-arr[i],i,res);
        }
        for(List<Integer> ele: res){
            System.out.println(ele);
        }

        sc.close();
    }
}
