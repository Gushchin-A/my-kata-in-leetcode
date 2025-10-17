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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;

        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int digitOne = l1 != null ? l1.val : 0;
            int digitTwo = l2 != null ? l2.val : 0;
            int result = digitOne + digitTwo + carry;
            carry = result / 10;

            if (head == null) {
                head = new ListNode(result % 10);
                tail = head;
            } else {
                tail.next = new ListNode(result % 10);
                tail = tail.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
    
        }

        return head; 
    }
}
