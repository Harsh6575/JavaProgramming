package CodeForces;

// Petya and Strings

import java.util.Scanner;

public class CF112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                a = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if(a<0){
            System.out.println(-1);
        }else if(a>0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
