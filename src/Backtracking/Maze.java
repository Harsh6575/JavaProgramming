package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze("",3,3));
    }

    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }

    static List<String> maze(String p,int r, int c){
        if(r==1&&c==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(maze(p+"D",r-1,c));
        }
        if (c>1){
            ans.addAll(maze(p+"R",r,c-1));
        }
        return ans;
    }
}
