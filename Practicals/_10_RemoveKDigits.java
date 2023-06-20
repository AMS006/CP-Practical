package Practicals;
import java.util.Scanner;
import java.util.Stack;

public class _10_RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        if(k == 0)
            return num;

        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i = 0;i<n;i++){
            while(k>0 && !st.isEmpty() && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        if(st.size() == 0)
            return "0";

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        String res = str.reverse().toString();
        int idx = 0;
        while(idx < res.length() && res.charAt(idx) == '0')
            idx++;
        res = res.substring(idx,res.length());

        if(res.length() == 0)
            return "0";
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        System.out.println(removeKdigits(str,k));

        sc.close();
    }
}
// Python

// from typing import List
// def removeKdigits(num: str, k: int) -> str:
//     if k == 0:
//         return num
//     st = []
//     n = len(num)
//     for i in range(n):
//         while k > 0 and st and st[-1] > num[i]:
//             st.pop()
//             k -= 1
//         st.append(num[i])
//     while k > 0 and st:
//         st.pop()
//         k -= 1
//     if not st:
//         return "0"
//     res = "".join(st[::-1]).lstrip("0")
//     if not res:
//         return "0"
//     return res

// if __name__ == "__main__":
//     str = input()
//     k = int(input())
//     print(removeKdigits(str, k))

