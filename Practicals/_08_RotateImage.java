package Practicals;
import java.util.Scanner;

public class _08_RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
     
        for(int i = 0;i<n;i++){
            for(int j =i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
