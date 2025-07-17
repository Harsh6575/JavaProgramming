package CodeForces;

// Circle of Students

import java.util.Scanner;

public class CF1203A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean validClockwise = true;
            boolean validCounterClockwise = true;

            int pos = 0; // position of 1

            for (int i=0;i<n;i++){
                if(arr[i]==1){
                    pos=i;
                }
            }

            // check for clockwise
            for (int i = 0; i < n; i++) {
                if(arr[(pos+i)%n]!= (1 + i)){
                    validClockwise=false;
                    break;
                }
            }

            // check for counterclockwise
            for (int i = 0; i < n; i++) {
                if(arr[(pos - i + n) % n] != (1 + i)){
                    validCounterClockwise=false;
                    break;
                }
            }
            if(!validCounterClockwise&&!validClockwise){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
