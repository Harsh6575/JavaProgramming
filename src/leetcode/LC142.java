package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LC142 {
     /*
        Leetcode 142. Linked List Cycle II
    */

    static ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        
        if (fast == null || fast.next == null) return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode cycleNode = detectCycle(head);
        if (cycleNode != null) {
            int index = 0;
            ListNode current = head;
            while (current != cycleNode) {
                current = current.next;
                index++;
            }
            System.out.println("Cycle detected at node index: " + index);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
