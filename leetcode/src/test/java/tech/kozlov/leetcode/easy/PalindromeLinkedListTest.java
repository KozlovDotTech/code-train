package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;
import tech.kozlov.leetcode.easy.model.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {

    @Test
    public void solutionTest() {

        PalindromeLinkedList resolver = new PalindromeLinkedList();

        ListNode node1 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(4, node4);
        ListNode node6 = new ListNode(2, node5);
        ListNode node7 = new ListNode(2, node6);
        ListNode node8 = new ListNode(3, node7);

        assertTrue(resolver.isPalindrome(node8));

    }
}
