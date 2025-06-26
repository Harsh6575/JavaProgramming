package QueueLearning;

public class Main {
    public static void main(String[] args) {
        CircularQUE cque = new CircularQUE(5);
        cque.enqueue(4);
        cque.enqueue(6);
        cque.enqueue(7);
        cque.enqueue(41);
        cque.enqueue(45);

        cque.display();

        cque.dequeue();
//        cque.enqueue(24423); 
        cque.display();
    }
}
