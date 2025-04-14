package leetcode;

public class LC41 {
    /*
        Leetcode 41. First Missing Positive
        Cycle Sort Algorithm
    */

    static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if(arr[i]<=arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }


    static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}
