package leetcode;

public class LC3280 {
    /*
        Leetcode 3280. Convert Date to Binary

    */

    static String convertDateToBinary(String date) {
        String[] chunks = date.split("-");
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<chunks.length;i++){
            ans.append(binary(chunks[i]));
            if(i!=chunks.length-1){
                ans.append("-");
            }
        }
        return ans.toString();
    }

    static String binary(String date){
        int num = Integer.parseInt(date);
        StringBuilder ans = new StringBuilder();
        while (num!=1){
            ans.append(num%2);
            num=num/2;
        }
        ans.append("1");
        ans.reverse();
        return  ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
    }
}
