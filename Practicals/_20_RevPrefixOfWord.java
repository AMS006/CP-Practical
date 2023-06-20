package Practicals;
import java.util.Scanner;

// Create a idx variale of type integer and initialize it with -1
// Loop through the word and for every character check if it is equals
// to chracter ch then assign i to idx and break the loop
// If idx is -1 then return word
// Else take the substring from 0 to idx reverse it and add it to the remaining substring
// Return the res substring
public class _20_RevPrefixOfWord {
    public  static String reversePrefix(String word, char ch) {
        int idx = -1;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1)
            return word;
        
        StringBuilder rev = new StringBuilder(word.substring(0,idx+1));

        rev.reverse();

        String res = rev.toString() + word.substring(idx+1, word.length());

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(reversePrefix(word,ch));
        sc.close();
    }
}
