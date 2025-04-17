public class Patterns {
    public static void main(String[] args) {
        Pattern30(5);
    }
    static void Pattern1(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n?2*n-row:row;
                for (int j = 0; j <totalCols; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }

    static void Pattern2(int n){
        for (int row=0;row<=2*n;row++){
            int totalCols = row>n?2*n-row:row;
            int noOfSpaces=n-totalCols;
            for (int j=0;j<noOfSpaces;j++){
                System.out.print(" ");
            }
            for (int j = 0; j <totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern30(int n){
        for (int row = 1; row < n; row++) {
            for(int space=0;space<n-row;space++){
                System.out.print("  ");
            }
            for (int col = row; col>=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
