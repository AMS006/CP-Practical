package Practicals;
import java.util.Scanner;

// Create a Freq array of size 26
// Loop through every character of sentence
// For every character increment the index of freq array as freq[sentence[i] - 'a']
// Then loop through freq array and if at any index freq is zero then return false
// Else return true
public class _19_IsPanagram {
    public static boolean checkIfPangram(String sentence) {
        int count[] = new int[26];

        for(int i = 0;i<sentence.length();i++){
            int idx = (int)sentence.charAt(i) - 97;
            count[idx]++;
        }
        for(int i = 0;i<26;i++){
            if(count[i] == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();

        if(checkIfPangram(sentence))
            System.out.println("Sentence is Panagram");
        else
            System.out.println("Sentence is not Panagram");
        sc.close();
    }
}
