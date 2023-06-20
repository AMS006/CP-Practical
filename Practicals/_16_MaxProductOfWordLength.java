package Practicals;
import java.util.Scanner;

// Create max_product variable initialize it with 0 and create bitMask array of size n
// Loop through every words of array and for every words create a bitMask of that word and store it in bitMask array
// Again Loop through the array and check if bitMask and of two variables is zero then update max_product by taking max of max_product, multiplying length of two words
// Return max_product
public class _16_MaxProductOfWordLength {
    public static int maxProduct(String[] words) {
        int max_product = 0;
        int n = words.length;
        int bitMask[] = new int[n];

        for(int i = 0;i<n;i++){
            String str = words[i];
            for(int j = 0;j<str.length();j++){
                bitMask[i] |= (1 << (str.charAt(j) - 'a'));
            }
        }
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if((bitMask[i] & bitMask[j]) == 0){
                    max_product = Math.max(max_product,words[i].length() * words[j].length());
                }
            }
        }
        return max_product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i = 0;i<n;i++)
            words[i] = sc.next();
        System.out.println(maxProduct(words));
        sc.close();
    }
}
