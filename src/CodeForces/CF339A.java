package CodeForces;

// Helpful Maths

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("+","");
        int[] arr = new int[3];
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='1'){
                arr[0]++;
            }else if(input.charAt(i)=='2'){
                arr[1]++;
            }else {
                arr[2]++;
            }
        }
        List<String> sortedDigits = new ArrayList<>();
        for (int i = 0; i < arr[0]; i++) sortedDigits.add("1");
        for (int i = 0; i < arr[1]; i++) sortedDigits.add("2");
        for (int i = 0; i < arr[2]; i++) sortedDigits.add("3");

        System.out.println(String.join("+", sortedDigits));

    }
}
