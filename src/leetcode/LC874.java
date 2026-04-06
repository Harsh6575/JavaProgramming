package leetcode;

import java.util.Arrays;

public class LC874 {
    /*
        Leetcode 874. Walking Robot Simulation
    */
    static int robotSim(int[] commands, int[][] obstacles) {
          int x=0,y=0;
          int direction=0; // 0 north, 1 east, 2 south, 3 west
          int maxDistance=0;
          for (int command : commands) {
              if(command==-1){
                  direction=(direction+1)%4;
              } else if(command==-2){
                  direction=(direction+3)%4;
              } else {
                  for (int i = 0; i < command; i++) {
                      int nextX=x,nextY=y;
                      switch (direction){
                          case 0: nextY++; break;
                          case 1: nextX++; break;
                          case 2: nextY--; break;
                          case 3: nextX--; break;
                      }
                      boolean isObstacle=false;
                      for (int[] obstacle : obstacles) {
                          if(obstacle[0]==nextX && obstacle[1]==nextY){
                              isObstacle=true;
                              break;
                          }
                      }
                      if(isObstacle){
                          break;
                      } else {
                          x=nextX;
                          y=nextY;
                          maxDistance=Math.max(maxDistance,x*x+y*y);
                      }
                  }
              }
          }
          return maxDistance;
      }

    public static void main(String[] args) {
          int[] commands = {4,-1,3};
          int[][] obstacles = {};
          System.out.println(robotSim(commands, obstacles));
          commands = new int[]{4,-1,4,-2,4};
          obstacles = new int[][]{{2,4}};
          System.out.println(robotSim(commands, obstacles));
    }
}
