package BookProblems;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        char[][] grid = new char[n][m];
        for(int i = 0; i < n; i++){
            String row = in.next();
            for(int j = 0; j < row.length(); j++){
                grid[i][j] = row.charAt(j);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '*'){
                    System.out.print("*");
                }
                else{
                    System.out.print(countMines(grid, i, j));
                }
            }
            System.out.println();
        }
        in.close();
    }
    public static int countMines(char[][] grid, int i, int j){
        int count = 0, n = grid.length, m = grid[0].length;

        if(doesExist(i - 1, j - 1, n, m) && grid[i - 1][j - 1] == '*'){
            count++;
        }
        if(doesExist(i - 1, j, n, m) && grid[i - 1][j] == '*'){
            count++;
        }
        if(doesExist(i - 1, j + 1, n, m) && grid[i - 1][j + 1] == '*'){
            count++;
        }
        if(doesExist(i, j - 1, n, m) && grid[i][j - 1] == '*'){
            count++;
        }
        if(doesExist(i, j + 1, n, m) && grid[i][j + 1] == '*'){
            count++;
        }
        if(doesExist(i + 1, j - 1, n, m) && grid[i + 1][j - 1] == '*'){
            count++;
        }
        if(doesExist(i + 1, j, n, m) && grid[i + 1][j] == '*'){
            count++;
        }
        if(doesExist(i + 1, j + 1, n, m) && grid[i + 1][j + 1] == '*'){
            count++;
        }
        return count;
    }

    public static boolean doesExist(int i, int j, int n, int m){
        if(i < 0 || j < 0 || i > n - 1 || j > m - 1){
            return false;
        }
        return true;
    }
}