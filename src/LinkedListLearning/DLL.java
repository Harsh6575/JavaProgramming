package LinkedListLearning;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p = find(after);
         if(p==null){
             System.out.println("Node doesn't Exist");
             return;
         }
         Node node = new Node(val);
         node.next=p.next;
         p.next=node;
         node.prev=p;
         if(node.next!=null){
             node.next.prev=node;
         }
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("Null End");
    }

    public void displayRev(){
        Node last = null;
        Node node = head;
        while (node!=null){
            last=node;
            node=node.next;
        }
        while (last!=null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Null Start");

    }
}
