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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode next = current.next;
            int leftRange = current.val;
            int rightRange = next.val;
            int commonDivisors = getGCD(leftRange, rightRange);

            ListNode betweenNodesDivisor = new ListNode(commonDivisors);
            current.next = betweenNodesDivisor;
            betweenNodesDivisor.next = next;

            current = next;
        }

        return head;
    }

    private int getGCD(int leftRange, int rightRange) {
        int a = Math.max(leftRange, rightRange);
        int b = Math.min(leftRange, rightRange);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}