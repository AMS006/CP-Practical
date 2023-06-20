package Practicals;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Read the value of IpAddress store in str
// If str[0] == '0' || if Integer(str) > 255 then return false
// create two variable idx and part initialize them by 0
// If idx == str.length || part == 4 then check If both condition satisfy then add substr in res
// Else return
// Recursively call for findIpAddress() by increment idx , part and creating new substr
// return res
public class _09_RestoreIpAddress {
    public static boolean isValid(String str){
        if(str.charAt(0) == '0')
            return false;
        int n = Integer.parseInt(str);

        return n <= 255;
    }
    public static void findIpAddress(String str, int idx, int part, String temp, List<String> res){
        if(idx == str.length() || part == 4){
            if(idx == str.length() && part == 4){
                res.add(temp.substring(0,temp.length() - 1));
            }
            return;
        }

        findIpAddress(str,idx+1, part+1, temp+str.substring(idx,idx+1)+".", res);

        if(idx+2<=str.length() && isValid(str.substring(idx,idx+2)))
            findIpAddress(str,idx+2, part+1, temp+str.substring(idx,idx+2)+".", res);
        if(idx+3<=str.length() && isValid(str.substring(idx,idx+3)))
            findIpAddress(str,idx+3, part+1, temp+str.substring(idx,idx+3)+".", res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip = sc.next();
        List<String> res = new ArrayList<>();

        findIpAddress(ip,0,0,"",res);
        System.out.println(res);
        sc.close();
    }
}

// In Python

// def is_valid(s):
//     if s[0] == '0':
//         return False
//     n = int(s)
//     return n <= 255

// def find_ip_address(s, idx, part, temp, res):
//     if idx == len(s) or part == 4:
//         if idx == len(s) and part == 4:
//             res.append(temp[:-1])
//         return
//     find_ip_address(s, idx+1, part+1, temp+s[idx:idx+1]+".", res)
//     if idx+2 <= len(s) and is_valid(s[idx:idx+2]):
//         find_ip_address(s, idx+2, part+1, temp+s[idx:idx+2]+".", res)
//     if idx+3 <= len(s) and is_valid(s[idx:idx+3]):
//         find_ip_address(s, idx+3, part+1, temp+s[idx:idx+3]+".", res)

// ip = input()
// res = []
// find_ip_address(ip, 0, 0, "", res)
// print(res)