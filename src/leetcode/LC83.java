package leetcode;

public class LC83{
    /*
    Leetcode 83. Remove Duplicates from Sorted List
    Linked List
    */

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;
    }

    // Helper method to print the linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        System.out.println("Original List => ");
        printList(head);

        ListNode ans = deleteDuplicates(head);

        System.out.println("Answer =>");
        printList(ans);
    }
}