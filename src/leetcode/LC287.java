package leetcode;

public class LC287 {
     /*
        Leetcode 287. Find the Duplicate Number
        Cycle Sort Algorithm
    */

    static int findDuplicate(int[] nums) {

        //TRY 1
        int i=0;
        while (i<nums.length){
            if(nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[correct] != nums[i]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }

        return -1;

        // TRY 2
        //        boolean[] present = new boolean[nums.length];
        //        for(int i=0;i<nums.length;i++){
        //            if(!present[nums[i]-1]){
        //                present[nums[i]-1] = true;
        //            }else{
        //                return nums[i];
        //            }
        //        }
        //        return -1;
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
