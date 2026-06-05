package leetcode;

public class LC48 {
    /*
        Leetcode 48. Rotate Image
        In-place rotation
    */

    static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix1);
        for(int[] row:matrix1){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix2);
        for(int[] row:matrix2){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
