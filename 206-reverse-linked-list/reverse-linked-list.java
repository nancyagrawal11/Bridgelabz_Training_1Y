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

        // base class

       if (head == null || head.next == null) {
            return head;
        }

        // Recursive call
        ListNode newHead = reverseList(head.next);

        // Reverse the link
        head.next.next = head;
        head.next = null;

        return newHead;
        
        
    }
}