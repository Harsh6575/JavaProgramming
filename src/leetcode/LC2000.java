package leetcode;

public class LC2000 {
    /*
        Leetcode 2000. Reverse Prefix of Word
    */

    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        String prefix = word.substring(0, index + 1);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        return reversedPrefix + word.substring(index + 1);
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd')); // Output: "dcbaefd"
        System.out.println(reversePrefix("xyxzxe", 'z')); // Output: "zxyxxe"
        System.out.println(reversePrefix("abcd", 'z')); // Output: "abcd"
    }
}
