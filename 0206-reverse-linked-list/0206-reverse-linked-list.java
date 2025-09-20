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
    public ListNode reverseList(ListNode head) {
        ListNode tempHead = new ListNode();
        ListNode current = head;

        while(head != null) {
            current = head.next;
            head.next = tempHead.next;
            tempHead.next = head;
            head = current;
        }

        return tempHead.next;
    }
}