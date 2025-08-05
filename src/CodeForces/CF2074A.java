package CodeForces;

// Draw A Square

import java.util.Scanner;

public class CF2074A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            int u = sc.nextInt();

            double lu, ur, rd, dl, lr, du;
            if (l > 0 && r > 0 && d > 0 && u > 0) {
                lu = Math.pow(l, 2) + Math.pow(u, 2);
                lu = Math.sqrt(lu);
                ur = Math.pow(u, 2) + Math.pow(r, 2);
                ur = Math.sqrt(ur);
                rd = Math.pow(r, 2) + Math.pow(d, 2);
                rd = Math.sqrt(rd);
                dl = Math.pow(d, 2) + Math.pow(l, 2);
                dl = Math.sqrt(dl);

                lr = Math.pow(l, 2) + Math.pow(r, 2);
                lr = Math.sqrt(lr);
                du = Math.pow(d, 2) + Math.pow(u, 2);
                du = Math.sqrt(du);
                if (lu == ur && ur == rd && rd == dl && lr == du) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}