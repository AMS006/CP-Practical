package Practicals;
import java.util.*;
public class _07_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char str[] = strs[i].toCharArray();
            
            // sort string
            Arrays.sort(str);
            String s = String.valueOf(str);
            if(map.get(s)!=null){
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
            }
            else{
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for(Map.Entry<String, List<String>> en:map.entrySet()){
            res.add(en.getValue());
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.next();
        
        System.out.println(groupAnagrams(arr));

        sc.close();
    }
}
