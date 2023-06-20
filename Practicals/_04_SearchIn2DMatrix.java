package Practicals;
import java.util.*;
public class _04_SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        boolean find = false;
        while(i>=0){
            if(matrix[i][j] > target){
                i--;
                continue;
            }
            else{
                System.out.println(i);
                while(j < matrix[i].length){
                    if(matrix[i][j] == target){
                        find = true;
                        break;
                    }
                    j++;
                }
                break;
            }
        }
        return find;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        if(searchMatrix(matrix,target)){
            System.out.println("Element found");
        }
        else
            System.out.println("Element Not found");

        sc.close();
    }
}
