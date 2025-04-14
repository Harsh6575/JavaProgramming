import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr){

        boolean swapped=false;

        for (int i = 0; i < arr.length; i++) {
            int temp=Integer.MIN_VALUE;
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if did not sort for any iteration it means array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={12,1324,4155,411,313,2,3,41,1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
