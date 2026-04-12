/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int length = getLengthLinkedList(node);

        for (int i = 0; i < length; i++) {
            node.val = node.next.val;
            if (i == length - 1) {
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }

    private int getLengthLinkedList(ListNode node) {
        int length = 0;
        
        ListNode current = node;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        
        return length;
    }
}