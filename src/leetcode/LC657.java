package leetcode;

import java.util.Arrays;

public class LC657 {
    /*
        Leetcode 657. Robot Return to Origin
        String
    */

   static boolean judgeCircle(String moves) {
        int[] move = {0,0,0,0};
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U':
                    move[0]++;
                    break;
                case 'D':
                    move[1]++;
                    break;
                case 'L':
                    move[2]++;
                    break;
                case 'R':
                    move[3]++;
                    break;
            }
        }
        return move[0]==move[1] && move[2]==move[3];
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
