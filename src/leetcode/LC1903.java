package leetcode;

public class LC1903 {
    /*
        Leetcode 1903. Largest Odd Number in String
    */

    static String largestOddNumber(String num) {
        for (int i=num.length()-1; i>=0; i--){
            if ((num.charAt(i)-'0')%2==1) return num.substring(0, i+1);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
    }
}
