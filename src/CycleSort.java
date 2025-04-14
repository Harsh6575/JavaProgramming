import java.util.Arrays;

public class CycleSort {
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if( arr[i] >=0 &&  arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
