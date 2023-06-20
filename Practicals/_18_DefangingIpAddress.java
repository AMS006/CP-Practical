package Practicals;
import java.util.Scanner;

// Create a new res string variable and initialize it with empty string
// Loop through every character of address string and do follwing
// 1. If charAt(i) is equals to '.' then res = res + '[' + '.' + ']'
// 2. Else res += address.charAt(i)
// Return res string
public class _18_DefangingIpAddress {
    public static String defangIPaddr(String address) {
        String res = "";
        for(int i = 0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                res  = res + '[' + '.' + ']';
            }
            else
                res += address.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String address = sc.next();

        System.out.println(defangIPaddr(address));

        sc.close();
    }
}

// def defangIPaddr(address):
//     res = ""
//     for i in range(len(address)):
//         if address[i] == '.':
//             res += '[.]'
//         else:
//             res += address[i]
//     return res

// address = input()
// print(defangIPaddr(address))
