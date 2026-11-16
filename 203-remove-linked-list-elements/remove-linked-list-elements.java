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

        // Recursive call
        head.next = removeElements(head.next, val);

        // Remove current node if its value matches
        if (head.val == val) {
            return head.next;
        }

        return head;
        
    }
}