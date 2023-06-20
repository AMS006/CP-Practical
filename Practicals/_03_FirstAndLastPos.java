package Practicals;
import java.util.Scanner;

public class _03_FirstAndLastPos {
    public static int findFirst(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                if (m == 0 || arr[m] != arr[m - 1])
                    return m;
                else
                    e = m - 1;
            }
        }
        return -1;
    }
    public static int findLast(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                if (m == e || arr[m] != arr[m + 1])
                    return m;
                else
                    s = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Target : ");
        int target = sc.nextInt();
        int first = findFirst(arr, target);
        int second = findLast(arr, target);
        
        System.out.println();
        System.out.print("Positions : ");
        System.out.println(first + " " + second);

        sc.close();
    }
}
