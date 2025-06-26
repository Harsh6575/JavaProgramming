import java.util.*;

public class Main {
    static String addBinary(String a, String b) {
//        int a = Intege
        int s1 = Integer.parseInt(a);
        int s2=Integer.parseInt(b);
        System.out.println(s1+s2);
        return "";
    }

    static int[] countBits(int n) {
        String charA=Integer.toBinaryString(n);
        char[] m=charA.toCharArray();
        int[] ans = new int[m.length];
        for (int i=0;i<m.length;i++){
            ans[i]=m[i]-'0';
        }
        return ans;
    }
    static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < sandwiches.length; i++) {
            st.push(sandwiches[i]);
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }

        int remaining = 0;
        for (int i = 0; i < students.length; i++) {
            if(Objects.equals(queue.peek(), st.peek())){
                queue.remove();
                st.pop();
            }else {
                queue.add(queue.remove());
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
}