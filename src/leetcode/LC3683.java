package leetcode;

class LC3683{

    /*
        Leetcode 3683. Earliest Time to finish one Task
    */

    static int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] task: tasks){
            min = Math.min(min, task[0]+task[1]);
        }
        return min;   
    }

  public static void main(String[] args) {
      System.out.println(earliestTime(new int[][]{{1,6},{2,3}})); // 5
      System.out.println(earliestTime(new int[][]{{100,100},{100,100}})); // 200
  }
}