package leetcode;

class LC3945{

    /*
        Leetcode 3945. Digit Frequency Score
    */

    static int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int score = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                score += freq[i] * i;
            }
        }
        return score;  
    }

    public static void main(String[] args) {
        System.out.println(digitFrequencyScore(122)); // 5
        System.out.println(digitFrequencyScore(101)); // 2
    }
}