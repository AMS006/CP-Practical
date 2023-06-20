package Practicals;
import java.util.Scanner;

// Create a variable count = n , i = 0 and boolean visited array of size n 
// Loop until count is not equals 1
// Create temp = 1 and while temp < k do following
// 1. if !visited[i%n] then incremt temp by 1
// 2. Incremetn i by 1
// while visited[i%n] increment i by 1
// At index i mark visited[i] to true and decrement count by 1
// Loop throug visited array and at visited == false return i

public class _11_WinnerOfCircularGame {
    public static int findTheWinner(int n, int k) {
        int count = n;
        boolean visited[] = new boolean[n];
        int i = 0;
        while(count != 1){
            int temp = 1;
            while(temp<k){
                if(!visited[i%n])
                    temp++;
                i = (i+1)%n;
            }
            while(visited[i%n]){
                i = (i+1)%n;
            }
            System.out.println(i+1);
            visited[i] = true;
            count--;
        }
        int ans = 0;
        for(int j = 0;j<n;j++){
            if(visited[j] == false){
                ans = j+1;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        System.out.println(findTheWinner(n, k));

        sc.close();
    }
}
