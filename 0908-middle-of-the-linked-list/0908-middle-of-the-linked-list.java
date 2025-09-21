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
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ArrayList<ListNode> nodes = new ArrayList<>();
        int count = 0;

        while (head != null) {
            nodes.add(head);
            head = head.next;
            count++;
        }

        return nodes.get(count / 2);
    }
}
