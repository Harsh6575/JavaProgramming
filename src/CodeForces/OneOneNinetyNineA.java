package CodeForces;

// City Day

import java.util.Scanner;

public class OneOneNinetyNineA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isValid = true;
            for (int j = Math.max(0, i - x); j < i; j++) {
                if (arr[i] >= arr[j]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                for (int j = i + 1; j <= Math.min(n - 1, i + y); j++) {
                    if (arr[i] >= arr[j]) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(i + 1);
                break;
            }
        }

//        for (int i = x; i < n-y; i++) {
//            boolean left = true;
//            for (int j =0;j<i;j++){
//                if(arr[i]>arr[j]){
//                    left = false;
//                }
//            }
//            boolean right = true;
//
//            for (int j = i; j < x+y+i -1; j++) {
//                if(arr[i]>arr[j]){
//                    right = false;
//                }
//            }
//            if(left && right){
//                System.out.println(i);
//                break;
//            }
//        }
        sc.close();
    }
}
