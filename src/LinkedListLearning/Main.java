package LinkedListLearning;

public class Main {
    public static void main(String[] args) {
        LL1 ll = new LL1();
        ll.insertFirst(3);
        ll.insertLast(5);
        ll.insertLast(9);
        ll.insertLast(1);
        ll.insertRec(7,2);
        ll.display();
    }
}
