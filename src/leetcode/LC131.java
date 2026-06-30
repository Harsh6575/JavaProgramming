package leetcode;

import java.util.List;
import java.util.ArrayList;

public class LC131 {
     /*
        Leetcode 131. Palindrome Partitioning
    */

    static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(s, 0, path, res);
        return res;
    }

    static void backtrack(String s, int start, List<String> path, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<s.length(); i++){
            if(isPalindrome(s, start, i)){
                path.add(s.substring(start, i+1));
                backtrack(s, i+1, path, res);
                path.remove(path.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}
