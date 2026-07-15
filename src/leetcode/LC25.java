package leetcode;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LC25 {
     /*
        Leetcode 25. Reverse Nodes in k-Group
    */

    static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) {
                break;
            }
            ListNode nextGroupStart = kthNode.next;

            // Reverse the current group
            ListNode prev = nextGroupStart;
            ListNode curr = prevGroupEnd.next;
            while (curr != nextGroupStart) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect the previous group with the reversed current group
            ListNode temp = prevGroupEnd.next; // This is the new end of the reversed group
            prevGroupEnd.next = kthNode; // Connect to the new head of the reversed group
            prevGroupEnd = temp; // Move to the end of the reversed group for the next iteration
        }

        return dummy.next;
    }

    private static ListNode getKthNode(ListNode start, int k) {
        ListNode curr = start;
        for (int i = 0; i < k; i++) {
            if (curr.next == null) {
                return null;
            }
            curr = curr.next;
        }
        return curr;
    }

    // print the linked list for testing purposes
    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(reverseKGroup(head, 2));
    }
}
