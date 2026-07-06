package leetcode;

class LC3760{
    /*
        Leetcode 3760. Maximum Substrings With Distinct Start
    */

    static int maxDistinct(String s) {
        int count = 0;
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                count++;
                seen[c - 'a'] = true;
            }
        }
        return count;
    }

  public static void main(String[] args) {
      System.out.println(maxDistinct("abab")); // Output: 2
      System.out.println(maxDistinct("abcd")); // Output: 4
      System.out.println(maxDistinct("aaaa")); // Output: 1
  }
}