package CodeForces;

// Only One Digit

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CF2126A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int x = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            while (x!=0){
                list.addLast(x%10);
                x=x/10;
            }
            Collections.sort(list);
            System.out.println(list.getFirst());
        }
    }
}
