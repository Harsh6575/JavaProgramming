package leetcode;

public class LC1582 {
    /*
        Leetcode 1582. Special Positions in a Binary Matrix
    */

    static int numSpecial(int[][] mat) {
      int ans = 0;
      for (int i=0; i<mat.length; i++){
        for(int j=0; j<mat[0].length; j++){
          if (mat[i][j]==1){
            boolean isSpecial = true;
            for (int k=0; k<mat.length; k++){
              if (k!=i && mat[k][j]==1){
                isSpecial = false;
                break;
              }
            }
            for (int k=0; k<mat[0].length; k++){
              if (k!=j && mat[i][k]==1){
                isSpecial = false;
                break;
              }
            }
            if (isSpecial) ans++;
          }
        }
      }
      return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(numSpecial(mat));
    }
}
