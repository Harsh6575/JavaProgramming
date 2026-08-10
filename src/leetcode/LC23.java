package leetcode;

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}

public class LC23 {
     /*
        Leetcode 23. Merge k Sorted Lists
    */

    static ListNode mergeKLists(ListNode[] lists) {
        ListNode mergedList = null;
        for (ListNode list : lists) {
            mergedList = mergeTwoLists(mergedList, list);
        }
        return mergedList;
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printList(mergeKLists(new ListNode[]{
            new ListNode(1, new ListNode(4, new ListNode(5))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(2, new ListNode(6))
        }));

        printList(mergeKLists(new ListNode[]{}));
    }
}
