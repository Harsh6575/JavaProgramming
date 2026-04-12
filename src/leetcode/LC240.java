package leetcode;

public class LC240 {

    /*
        Leetcode 240. Search a 2D Matrix II
        Binary Search
     */

    static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        int shorterDim = Math.min(matrix.length, matrix[0].length);
        for(int i=0;i<shorterDim;i++){
            boolean verticalFound = binarySearch(matrix, target, i, true);
            boolean horizonatalFound = binarySearch(matrix, target, i, false);
            if(verticalFound || horizonatalFound){
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical?matrix[0].length-1:matrix.length-1;
        while(hi>=lo){
            int mid = (lo+hi)/2;
            if(vertical){
                if(matrix[start][mid]<target){
                    lo = mid+1;
                }else if (matrix[start][mid]>target){
                    hi = mid-1;
                }else{
                    return true;
                }
            }else{
                if(matrix[mid][start]<target){
                    lo = mid+1;
                }else if(matrix[mid][start]>target){
                    hi=mid-1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }
}