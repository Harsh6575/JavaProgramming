public class Fib {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    static int fibonacci(int n){
//        int fir=0;
//        int sec=1;
//        for (int i=0;i<n;i++){
//
//        }
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
