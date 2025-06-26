package StackLearning;

public class DynamicSTK extends STK{
    public DynamicSTK() {
        super();
    }

    public DynamicSTK(int size) {
        super(size);
    }

    @Override
    public void push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        super.push(item);
    }
}
