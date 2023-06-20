package BookProblems;

import java.util.Scanner;

// Read the Input variable n -> Number of relatives
// Create a array of size n to store the distance of relatives
// Loop through distance array and for every distance compute the minimum distance to reach to all relatives
// Return minDistance

public class VitosFamily {
    public static int getDistance(int currDis, int distances[], int n){
        int total = 0;
        for(int i = 0;i<n;i++){
            total += Math.abs(currDis - distances[i]);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt(); // Number of relatives
            int arr[] = new int[n];

            for(int i = 0;i<n;i++)
                arr[i] = sc.nextInt();
            
            int minDistance = getDistance(arr[0],arr,n);
            
            for(int i = 1;i<n;i++){
                minDistance = Math.min(minDistance,getDistance(arr[i], arr, n));
            }
            System.out.println("Min Distance : " + minDistance);

            sc.close();
        }
    }
}
