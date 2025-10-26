/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> storage = new HashSet<>();
        ListNode current = head;

        while (current != null) {
            boolean alreadySeen = storage.add(current);
            if (!alreadySeen) {
                return true; 
            }
            current = current.next;
        }

        return false;
    }
}