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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head, cur = head;

        while (n > 0) {
            cur = cur.next;
            n--;
        }

        if (cur == null) return head.next;

        while (cur.next != null) {
            prev = prev.next;
            cur = cur.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}