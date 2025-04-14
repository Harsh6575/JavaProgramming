import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length - i - 1;
            int maxIndex = getMaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    static int getMaxindex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={12,313,2,3,41,1,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
