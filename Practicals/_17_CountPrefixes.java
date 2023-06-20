package Practicals;
import java.util.Scanner;

// Declare a count variable and initialize it with 0
// Loop through the array of string and for every word do following
// 1. if current word length is less than prefix word then find the substring of prefix word from 0 to currentWord.length
// 2. if current word is equal to substr then increment count
// Return count variable
public class _17_CountPrefixes {
    public static int countPrefixes(String[] words, String s) {
        int res_count = 0;

        for(int i = 0;i<words.length;i++){
            if(words[i].length() <= s.length()){
                String substr = s.substring(0,words[i].length());

                if(words[i].equals(substr))
                    res_count++;
            }
        }
        return res_count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i = 0;i<n;i++)
            words[i] = sc.next();
        String str = sc.next();

        System.out.println(countPrefixes(words, str));

        sc.close();
    }
}
