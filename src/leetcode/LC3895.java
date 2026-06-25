package leetcode;

class LC3895{

    /*
        Leetcode 3895. Count Digit Appearances
    */

    static int countDigitOccurrences(int[] nums, int digit) {
      int count = 0;
      for(int i=0; i<nums.length; i++){
          int num = nums[i];
          while(num > 0){
              if(num % 10 == digit) count++;
              num /= 10;
          }
      }
      return count;  
    }

    public static void main(String[] args) {
       System.out.println(countDigitOccurrences(new int[]{12, 54, 32, 22}, 2));
       System.out.println(countDigitOccurrences(new int[]{1, 34, 7}, 9));
    }
}