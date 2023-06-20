package Practicals;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class _02_Permutations {
    public static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void printAllPermutations(int arr[], int s, List<List<Integer>> res){
        if(s == arr.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<arr.length;i++){
                list.add(arr[i]);
            }
            res.add(list);
            return;
        }
        for(int i = s;i<arr.length;i++){
            swap(arr,i,s);
            printAllPermutations(arr, s+1, res);
            swap(arr,i,s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i= 0;i<n;i++)
            arr[i] = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        printAllPermutations(arr,0,res);

        System.out.println(res);
        sc.close();
    }
}
