package BookProblems;
import java.util.Scanner;

public class Jolly_NotJolly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int diff = 0;
        boolean isJolly = true;
        for(int i = 0;i<n-1;i++){
            diff = Math.abs(arr[i+1] - arr[i]);
            if(diff <1 || diff > n){
                isJolly = false;
                break;
            }
        }
        if(isJolly)
            System.out.print("Jolly");
        else
            System.out.print("Not-Jolly");
        sc.close();
    }
}
