package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;
import tech.kozlov.leetcode.easy.model.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MiddleOfTheLinkedListTest {

    @Test
    public void solutionTest() {

        MiddleOfTheLinkedList resolver = new MiddleOfTheLinkedList();

        ListNode node1 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(4, node4);
        ListNode node6 = new ListNode(2, node5);
        ListNode node7 = new ListNode(2, node6);
        ListNode node8 = new ListNode(3, node7);

        assertEquals(node5,resolver.middleNode(node8));

    }
}
