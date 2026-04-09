package leetcode;

class LC3798{

    /*
        Leetcode 3798. Largest Even Number
    */

    static String largestEven(String s) {
      for(int i=s.length()-1; i>=0; i--){
          if((s.charAt(i)-'0')%2==0) return s.substring(0, i+1);
      }
      return "";
    }

  public static void main(String[] args) {
      System.out.println(largestEven("1112"));
      System.out.println(largestEven("221"));
      System.out.println(largestEven("1"));
  }
}