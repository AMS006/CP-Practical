package Practicals;
import java.util.Scanner;
import java.util.Stack;

public class _06_ValidParantheses {
    public static boolean isValidParanthesis(String s){
        Stack<Character> st = new Stack<Character>();
        boolean b = false;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) =='{'){
                st.push(s.charAt(i));
                b = true;
            }
            else if(!st.isEmpty()){
                if((s.charAt(i) == ']' && st.peek()=='[') 
                    || (s.charAt(i) == ')' && st.peek()=='(')
                    || (s.charAt(i) == '}' && st.peek()=='{'))
                    st.pop();
                else{
                    b = false;
                    break;
                }
            }
            else{
                b=false;
                break;
            }
            

        }
        if(st.isEmpty() && b)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(isValidParanthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
        
        sc.close();


    }
}
