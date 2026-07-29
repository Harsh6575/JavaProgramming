package leetcode;

class NumArray {

    int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = nums;
        if(prefixSum.length > 0){
            for(int i=1;i<prefixSum.length;i++){
                prefixSum[i] += prefixSum[i-1];
            }
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) {
            return prefixSum[right];
        } else {
            return prefixSum[right] - prefixSum[left - 1];
        }
    }
}

public class LC303 {
     /*
        Leetcode 303. Range Sum Query - Immutable
        Prefix Sum Algorithm
    */

    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(arr);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
