package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LC237 {

    /*
        Leetcode 237. Delete Node in a Linked List
        Delete a node from a singly-linked list when only given access to that node
     */

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        deleteNode(head.next); // Delete the node with value 5

        // Print the modified list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}