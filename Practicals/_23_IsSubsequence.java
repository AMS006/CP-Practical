package Practicals;
import java.util.Scanner;

// Create to variables i and j initialize them by 0
//  Loop through string s and string t
// If s[i] == s[j] then increment i, j by 1
// Else increment j by 1
// If i == s.length() return true
// Else return false

public class _23_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else
                j++;
        }
        if(i == s.length())
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(isSubsequence(str1, str2))
            System.out.println("Subsequece");
        else
            System.out.println("Not Subsequence");

        sc.close();
    }
}
