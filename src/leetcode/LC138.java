package leetcode;

class Node {
    int val;
    Node next;
    Node random;

    Node(int x) {
        this.val = x;
        this.next = null;
        this.random = null;
    }
}

public class LC138 {
     /*
        Leetcode 138. Copy List with Random Pointer
    */

    static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create a copy of each node and insert it right after the original node
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Assign random pointers for the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate the original list and the copied list
        Node pseudoHead = new Node(0);
        Node copyCurrent = pseudoHead;
        current = head;

        while (current != null) {
            copyCurrent.next = current.next;
            copyCurrent = copyCurrent.next;

            current.next = copyCurrent.next;
            current = current.next;
        }

        return pseudoHead.next;
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print("Node val: " + current.val);
            if (current.random != null) {
                System.out.print(", Random points to: " + current.random.val);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.random = head.next;
        head.next.random = head;

        Node copiedList = copyRandomList(head);
        System.out.println("Original List:");
        printList(head);
        System.out.println("Copied List:");
        printList(copiedList);
    }
}
