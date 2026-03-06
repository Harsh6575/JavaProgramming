package leetcode;

public class LC1784 {
    /*
        Leetcode 1784. Check if Binary String Has at Most One Segment of Ones
    */

    static boolean checkOnesSegment(String s) {
      boolean ans=true;
      for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i)=='0' && i+1<s.length() && s.charAt(i+1)=='1'){
              ans=false;
              break;
          }
      }
      return ans;
    }

    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001")); // false
        System.out.println(checkOnesSegment("110")); // true
    }
}
