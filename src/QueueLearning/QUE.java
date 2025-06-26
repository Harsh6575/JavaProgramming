package QueueLearning;

public class QUE {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int end = 0;

    public QUE(){
        this(DEFAULT_SIZE);
    }

    public QUE(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end==data.length-1;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        data[end++]=item;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }
}
