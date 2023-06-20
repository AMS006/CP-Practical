package Practicals;
import java.util.*;


// Create a HashMap map of type String and Integer
// Loop Through the array and inside map put string and it's frequence
// Loop through the array and check if string inside the map have freq == 1 then decrement k by 1
// If k == 0 then return arr[i];
// Else return empty string
public class _21_KthDistinctString {
    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }

        for(int i = 0;i<arr.length;i++){
            if(map.get(arr[i]) == 1)
                k--;
            if(k == 0)
                return arr[i];
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.next();
        int k = sc.nextInt();

        System.out.println(kthDistinct(arr,k));

        sc.close();

    }
}
