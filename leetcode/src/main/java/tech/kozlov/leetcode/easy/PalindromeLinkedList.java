package tech.kozlov.leetcode.easy;

import tech.kozlov.leetcode.easy.model.ListNode;

public class PalindromeLinkedList {

    /*
     * bad bad bad, but work:(
     */
    public boolean isPalindrome2(ListNode head) {
        int[] indexSums = new int[10];
        int len = 0;
        ListNode cur = head;
        do {
            indexSums[cur.val] = indexSums[cur.val] + (len*len*len);
            len++;
            cur = cur.next;
        } while (cur != null);
        cur = head;
        do {
            len--;
            indexSums[cur.val] = indexSums[cur.val] - (len*len*len);
            cur = cur.next;
        } while (cur != null);
        for (int val: indexSums) {
            if (!(val == 0)) return false;
        }
        return true;
    }

    /**
     * Solution 2 copy
     */
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        if (head.next.next == null) {
            return head.val == head.next.val;
        }

        ListNode slow1 = head;
        ListNode slow2 = slow1.next;
        ListNode slow3 = slow2.next;
        ListNode fast = slow3;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow2.next = slow1;
            slow1 = slow2;
            slow2 = slow3;
            slow3 = slow3.next;
        }

        for (ListNode head2 = (fast == null) ? slow2 : slow3;
             head2 != null;
             head2=head2.next, slow1=slow1.next) {

            if (slow1.val != head2.val)
                return false;
        }

        return true;
    }
}
