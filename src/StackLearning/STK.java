package StackLearning;

public class STK {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public STK(){
        this(DEFAULT_SIZE);
    }

    public STK(int size){
        this.data=new int[size];
    };

    public void push(int item){
        if(isFull()){
            System.out.println("Stack OverFlow");
//            return true;
//            throw new Exception("Stack Overflow");
        }

        ptr++;
        data[ptr] = item;
//        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Underflow");
        }
        return data[ptr--];
    };

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Underflow");
        }

        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length - 1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}
