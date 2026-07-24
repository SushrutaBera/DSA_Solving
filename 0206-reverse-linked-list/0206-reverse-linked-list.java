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
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = head, cur = head.next;
        ListNode nex = head.next.next;
        prev.next = null;
        while(cur != null) {
            cur.next = prev;
            prev = cur;
            cur = nex;
            if(nex == null) break;
            nex = nex.next;
        }
        // cur.next = prev;
        return prev;
    }
}