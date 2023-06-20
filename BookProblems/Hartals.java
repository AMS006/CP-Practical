package BookProblems;

import java.util.Scanner;

// Reat input N -> Number of days , P -> Number of parties
// Create a array of parties[P] read read hartal parameter for parties, and initialize count variable with 0
// Loop through all days and for each day check if  day%7 !=6 && day%7 != 0 && isHoliday() then increment count by 1
// Return count

public class Hartals {
    public static boolean isHoliday(int day,int parties[],int P){
        for (int i = 0; i < P; ++i)
        if (day % parties[i] == 0)
            return true;
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int P = sc.nextInt();
            int parties[] = new int[P];
            for(int i = 0;i<P;i++)
                parties[i] = sc.nextInt();
            
            int count = 0;

            for(int i = 1;i<=N;i++){
                if(i%7 != 6 && i%7 != 0 && isHoliday(i,parties,P))
                    count++;
            }
            System.out.println("Working Days Lost : " +count);
        }
        sc.close();
    }
}
