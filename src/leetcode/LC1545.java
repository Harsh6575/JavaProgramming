package leetcode;

public class LC1545 {
    /*
        Leetcode 1545. Find Kth Bit in Nth Binary String
    */

    static char findKthBit(int n, int k) {
      StringBuilder sb = new StringBuilder("0");
      for (int i = 2; i <= n; i++) {
      String prev = sb.toString();
      sb.append("1");
      
      // Invert and Reverse the previous string
      StringBuilder temp = new StringBuilder();
      for (int j = prev.length() - 1; j >= 0; j--) {
          temp.append(prev.charAt(j) == '0' ? '1' : '0');
      }
      sb.append(temp);
      
      // Optimization: stop if we already have the k-th character
      if (sb.length() >= k) break;
      }
      return sb.charAt(k - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        char result = findKthBit(n, k);
        System.out.println(result);
    }
}
