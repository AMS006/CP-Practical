package Practicals;
import java.util.*;
// Create a res ArrayList to store results
// Loop through the Input string and for every character do the following
// 1. if str[i] == '+' || == '-' || '*' then recursively call for left and right part of substring
// 2. Loop through leftPart and right part and do the following
// 2.1: If ch == '+' res.add(leftPart.get(j) + rightPart.get(k))
// 2.2: if ch == '0' res.add(leftPart.get(j) - rightPart.get(k));
// 2.3 if ch == '*' res.add(leftPart.get(j) * rightPart.get(k));
// If res.size == 0 then  res.add(Integer(str))
// Return res
public class _12_DifferentWaysToAddParantheses {
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        int n = expression.length();
        for(int i = 0;i<n;i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> leftPart = diffWaysToCompute(expression.substring(0,i));
                List<Integer> rightPart = diffWaysToCompute(expression.substring(i+1,n));

                for(int j = 0;j<leftPart.size();j++){
                    for(int k = 0;k<rightPart.size();k++){
                        if(ch == '+') res.add(leftPart.get(j) + rightPart.get(k));
                        if(ch == '-') res.add(leftPart.get(j) - rightPart.get(k));
                        if(ch == '*') res.add(leftPart.get(j) * rightPart.get(k));
                    }
                }
            }
        }
        if(res.size() == 0)
            res.add(Integer.parseInt(expression));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exp = sc.next();

        System.out.println(diffWaysToCompute(exp));

        sc.close();
    }
}
