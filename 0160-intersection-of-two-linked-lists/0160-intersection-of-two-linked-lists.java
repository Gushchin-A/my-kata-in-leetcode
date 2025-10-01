/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }

        int lengthA = getLengthListNode(headA); // 5
        int lengthB = getLengthListNode(headB); // 6
        int difference = Math.abs(lengthA - lengthB);

        ListNode large = new ListNode();
        ListNode small = new ListNode();

        if (lengthA != lengthB) {
            large = lengthA > lengthB ? headA : headB;
            small = lengthA < lengthB ? headA : headB;
        } else {
            large = headA;
            small = headB;
        }

        int i = 0;
        while (i < difference) {
            large = large.next;
            i++;
        }

        while (large != null && small != null) {
            if (large == small) {
                return large;
            }
            large = large.next;
            small = small.next;
        }

        return null;
    }

    public int getLengthListNode(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}
