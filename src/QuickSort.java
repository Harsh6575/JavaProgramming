import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int low,int high){
        if (low >= high) {
            return;
        }

        int s=low;
        int e=high;
        int mid= s + (e-s)/2;
        int pivot=arr[mid];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }

            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }

        // now pivot at correct spot sort
        quickSort(arr,low,e);
        quickSort(arr,s,high);

    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr={12,313,2,3,41,1,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
