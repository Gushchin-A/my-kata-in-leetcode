/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;
        head = new ListNode();
        ListNode temp = head;

        int sum = 0;
        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
                current = current.next;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
                current = current.next;
                sum = 0;
            }
        }

        return head.next;
    }
}