import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int[] ans = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length&&j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else {
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        // if any array complete before other than add all remaining elements in ans
        while (i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={12,313,2,3,41,1,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
