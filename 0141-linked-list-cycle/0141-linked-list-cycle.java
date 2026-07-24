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
        if(head == null || head.next == null) return false;
        ListNode prev = head, cur = head;
        while(cur != null && cur.next != null) {
            prev = prev.next;
            if(cur.next.next == null) return false;
            cur = cur.next.next; // cur = prev.next;
            if(prev == cur) return true;
        }
        return false;
    }
}