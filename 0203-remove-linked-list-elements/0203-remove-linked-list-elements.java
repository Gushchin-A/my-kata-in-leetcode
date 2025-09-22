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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode tempHead = new ListNode();
        ListNode current = tempHead;

        while (head != null) {
            if (head.val != val) {
                current.next = head;
                head = head.next;
                current = current.next;
                current.next = null;
            } else {
                head = head.next;
            }
        }

        return tempHead.next;
    }
}
