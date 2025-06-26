package QueueLearning;

public class CircularQUE {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    private int end = 0;
    private int front=0;

    private int size = 0;

    public CircularQUE(){
        this(DEFAULT_SIZE);
    }

    public CircularQUE(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        data[end++]=item;
        end=end%data.length;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int removed = data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        int i=front;
        do {
            System.out.print(data[i]+" ");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("End");
    }
}
