package StackLearning;

public class Main {
    public static void main(String[] args) throws Exception {
        STK stack = new STK(5);
        stack.push(1);
        stack.push(2);
        stack.push(13);
        stack.push(15);
        stack.push(16);
//        System.out.println(stack.push(18));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
