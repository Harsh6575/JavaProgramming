import java.util.Arrays;

public class BinarySearch2d {

    static int[] Serch2d(int[][] arr,int target){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[] SearchBinary2d(int[][] arr,int target){
        for (int row=0;row<arr.length;row++){
//            int col=0;
            int start=0;
            int end=arr[row].length -1;
            while (start<end){
                int mid = start + (end - start)/2;
                if(target<arr[row][mid]){
                    end=mid+1;
                } else if (target>arr[row][mid]) {
                    start=mid+1;
                }else {
                    return new int[] {row,mid};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while (r<matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new  int[] {r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15, 25, 35, 45},
                {28,29,37,49},
                {33, 34, 38, 50}};
        System.out.printf(Arrays.toString(search(arr,37)));
    }
}
